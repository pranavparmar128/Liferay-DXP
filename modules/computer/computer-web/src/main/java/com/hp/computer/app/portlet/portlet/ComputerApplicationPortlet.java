package com.hp.computer.app.portlet.portlet;

import com.hp.computer.app.model.Computer;
import com.hp.computer.app.portlet.constants.ComputerApplicationPortletKeys;
import com.hp.computer.app.portlet.util.SearchHelper;
import com.hp.computer.app.service.ComputerLocalService;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.search.ParseException;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.kernel.search.SearchContextFactory;
import com.liferay.portal.kernel.search.SearchException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Portal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Pranav
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=ComputerApplication",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + ComputerApplicationPortletKeys.COMPUTERAPPLICATION,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user",
		"com.liferay.portlet.css-class-wrapper=computer-web"
	},
	service = Portlet.class
)
public class ComputerApplicationPortlet extends MVCPortlet {

	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

		boolean isEdit = ParamUtil.getBoolean(renderRequest, "isEdit", false);

		if(!isEdit) {
		
			String keywords = ParamUtil.getString(renderRequest, "keywords");
			renderRequest.setAttribute("keywords", keywords);
			
			if(_log.isDebugEnabled()) {
				_log.debug("keywords :" + keywords);
			}
			
			List<Computer> computerList = new ArrayList<Computer>();

			int totalCount = 0;
			int delta = ParamUtil.getInteger(renderRequest, "delta", 5);
			int cur = ParamUtil.getInteger(renderRequest, "cur", 1);

			int end = delta * cur;
			int start = end - delta;

			try {
				// Searching computer
				SearchContext searchContext = SearchContextFactory.getInstance(_portal.getHttpServletRequest(renderRequest));
				searchContext.setKeywords(keywords);
				
				computerList = _searchHelper.searchComputer(searchContext);
				totalCount = computerList.size();

				if (end > totalCount) {
					end = totalCount;
				}

				if(_log.isDebugEnabled()) {
					_log.debug("start :" + start + ", end :" + end + ", totalCount :" + totalCount);
				}
				computerList = computerList.subList(start, end);

			} catch (SearchException e) {

				_log.error("Error while searching computer :" + e.getMessage(), e);
				hideDefaultErrorMessage(renderRequest);
				SessionErrors.add(renderRequest, "error-search-exception");

			} catch (ParseException e) {
				_log.error("Error while building search query computer :" + e.getMessage(), e);
				hideDefaultErrorMessage(renderRequest);
				SessionErrors.add(renderRequest, "error-search-exception");
			}
			
			renderRequest.setAttribute("computerList", computerList);
			renderRequest.setAttribute("computerListCount", totalCount);
		}
		super.render(renderRequest, renderResponse);
	}

	private static Log _log = LogFactoryUtil.getLog(ComputerApplicationPortlet.class);

	@Reference
	private ComputerLocalService _computerLocalService;

	@Reference
	private SearchHelper _searchHelper;
	
	@Reference
	private Portal _portal;
}