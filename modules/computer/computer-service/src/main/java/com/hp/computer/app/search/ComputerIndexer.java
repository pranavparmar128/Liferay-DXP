package com.hp.computer.app.search;

import com.hp.computer.app.model.Computer;
import com.hp.computer.app.search.field.ComputerFields;
import com.hp.computer.app.service.ComputerLocalService;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.BaseIndexer;
import com.liferay.portal.kernel.search.BooleanQuery;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.IndexWriterHelper;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.kernel.search.Summary;
import com.liferay.portal.kernel.search.filter.BooleanFilter;
import com.liferay.portal.kernel.util.GetterUtil;

import java.util.Locale;

import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
@Component(
    immediate = true,
    service = Indexer.class
)
public class ComputerIndexer extends BaseIndexer<Computer> {

	public ComputerIndexer() {
	    setDefaultSelectedFieldNames(
	        Field.COMPANY_ID, Field.CONTENT,
	        Field.ENTRY_CLASS_NAME, Field.ENTRY_CLASS_PK, 
	        Field.SCOPE_GROUP_ID, Field.TITLE, 
	        ComputerFields.COMPANY, ComputerFields.MODEL_NAME, 
	        ComputerFields.OPERATING_SYSTEM, ComputerFields.COST, ComputerFields.RATING);
	    setPermissionAware(true);
	    setFilterSearch(true);
	}
	
	@Override
	public String getClassName() {
		return CLASS_NAME;
	}

	@Override
	protected void doDelete(Computer computer) throws Exception {
		deleteDocument(computer.getCompanyId(), computer.getComputerId());
	}

	@Override
	protected Document doGetDocument(Computer computer) throws Exception {

		Document document = getBaseModelDocument(CLASS_NAME, computer);
		
		document.addKeyword(Field.ENTRY_CLASS_PK, computer.getComputerId());
		document.addKeyword(Field.COMPANY_ID, computer.getCompanyId());
		document.addKeyword(Field.GROUP_ID, computer.getGroupId());
		document.addText(ComputerFields.COMPANY, computer.getCompany());
		document.addText(ComputerFields.MODEL_NAME, computer.getModelName());
		document.addText(ComputerFields.OPERATING_SYSTEM, computer.getOperatingSystem());
		document.addKeyword(ComputerFields.COST, computer.getCost());
		document.addKeyword(ComputerFields.RATING, computer.getRating());
		
		return document;
	}

	@Override
	protected Summary doGetSummary(Document document, Locale locale, String snippet, PortletRequest portletRequest,
			PortletResponse portletResponse) throws Exception {
		Summary summary = createSummary(document);
	    summary.setMaxContentLength(200);
	    return summary;
	}

	@Override
	protected void doReindex(String className, long classPK) throws Exception {
		Computer computer = _computerLocalService.getComputer(classPK);
	    doReindex(computer);
	}

	@Override
	protected void doReindex(String[] ids) throws Exception {
		long companyId = GetterUtil.getLong(ids[0]);
	    reindexComputer(companyId);
	}

	@Override
	protected void doReindex(Computer computer) throws Exception {
		Document document = getDocument(computer);
		_indexWriterHelper.updateDocument(getSearchEngineId(), computer.getCompanyId(), document, true);
	}
	
	@Override
	public void postProcessContextBooleanFilter(
	        BooleanFilter contextBooleanFilter, SearchContext searchContext)
	throws Exception {
		
		addSearchGroupId(contextBooleanFilter, searchContext);
	}
	
	@Override
	public void postProcessSearchQuery(BooleanQuery searchQuery, BooleanFilter fullQueryBooleanFilter,
			SearchContext searchContext) throws Exception {
		
		addSearchTerm(searchQuery, searchContext, ComputerFields.COMPANY, false);
		addSearchTerm(searchQuery, searchContext, ComputerFields.MODEL_NAME, false);
		addSearchTerm(searchQuery, searchContext, ComputerFields.OPERATING_SYSTEM, false);
		addSearchTerm(searchQuery, searchContext, ComputerFields.COST, false);
		addSearchTerm(searchQuery, searchContext, ComputerFields.RATING, false);
		addSearchTerm(searchQuery, searchContext, Field.GROUP_ID, false);
 	}
	
	protected void reindexComputer(long companyId) throws PortalException {

		final IndexableActionableDynamicQuery indexableActionableDynamicQuery = _computerLocalService
				.getIndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setCompanyId(companyId);

		indexableActionableDynamicQuery.setPerformActionMethod(

				new ActionableDynamicQuery.PerformActionMethod<Computer>() {
					@Override
					public void performAction(Computer computer) {
						try {
							Document document = getDocument(computer);
							indexableActionableDynamicQuery.addDocuments(document);
						} catch (PortalException pe) {
							if (_log.isWarnEnabled()) {
								_log.warn("Unable to index computer " + computer.getComputerId(), pe);
							}
						}
					}
				});
		indexableActionableDynamicQuery.setSearchEngineId(getSearchEngineId());
		indexableActionableDynamicQuery.performActions();
	}
	
	public static final String CLASS_NAME = Computer.class.getName();
	
	private static Log _log = LogFactoryUtil.getLog(ComputerIndexer.class);

	@Reference
	protected IndexWriterHelper _indexWriterHelper;
	
	@Reference
	private ComputerLocalService _computerLocalService;
}
