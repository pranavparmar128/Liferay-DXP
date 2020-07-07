package com.hp.computer.app.portlet.util;

import com.hp.computer.app.model.Computer;
import com.hp.computer.app.search.field.ComputerFields;
import com.hp.computer.app.service.ComputerLocalService;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.Hits;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.IndexerRegistry;
import com.liferay.portal.kernel.search.ParseException;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.kernel.search.SearchException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.Validator;

import java.util.ArrayList;
import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
    immediate = true,
    service = SearchHelper.class
)
public class SearchHelper {
	
	public List<Computer> searchComputer(SearchContext searchContext) throws ParseException, SearchException {

		List<Computer> computerList = new ArrayList<Computer>();

		if(Validator.isNotNull(searchContext.getKeywords())) {

			Indexer<Computer> indexer = _indexerRegistry.getIndexer(Computer.class);

			Hits hits =  indexer.search(searchContext); 

		    List<Document> documents = hits.toList(); 

		    if(_log.isDebugEnabled()) {
		    	_log.debug("Hits size :" + documents.size());
		    }
		    
		    for (Document document : documents) { 

		    	long computerId = GetterUtil.getLong(document.get(Field.ENTRY_CLASS_PK));

				if(_log.isDebugEnabled()) {
					_log.debug("computerId :" + computerId + ", company :" + document.get(ComputerFields.COMPANY) + ", modelName :" + document.get(ComputerFields.MODEL_NAME) + 
							", OS :" + document.get(ComputerFields.OPERATING_SYSTEM) + ", Cost :" + document.get(ComputerFields.COST) + ", Rating :" + document.get(ComputerFields.RATING));
				}

				Computer computer = _computerLocalService.createComputer(computerId);
				computer.setCompany(document.get(ComputerFields.COMPANY));
				computer.setModelName(document.get(ComputerFields.MODEL_NAME));
				computer.setOperatingSystem(document.get(ComputerFields.OPERATING_SYSTEM));
				computer.setCost(GetterUtil.getDouble(document.get(ComputerFields.COST)));
				computer.setRating(GetterUtil.getInteger(document.get(ComputerFields.RATING)));

				computerList.add(computer);
		    }
		} else {
			computerList = _computerLocalService.getComputers(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		}

		return computerList;
	}
	
	private static Log _log = LogFactoryUtil.getLog(SearchHelper.class);
	
	@Reference(unbind = "-")
	public void setComputerLocalService(ComputerLocalService computerLocalService) {
		_computerLocalService = computerLocalService;
	}
	
	@Reference(unbind = "-")
	public void setIndexerRegistry(IndexerRegistry indexerRegistry) {
		_indexerRegistry = indexerRegistry;
	}
	
	private IndexerRegistry _indexerRegistry;
	private ComputerLocalService _computerLocalService;
}
