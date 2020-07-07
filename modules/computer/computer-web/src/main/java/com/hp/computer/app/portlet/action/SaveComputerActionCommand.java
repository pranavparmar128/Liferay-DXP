package com.hp.computer.app.portlet.action;

import com.hp.computer.app.model.Computer;
import com.hp.computer.app.portlet.constants.ComputerApplicationPortletKeys;
import com.hp.computer.app.service.ComputerLocalService;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;

import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
    immediate = true,
    property = {
        "javax.portlet.name=" + ComputerApplicationPortletKeys.COMPUTERAPPLICATION,
        "mvc.command.name=/save/computer"
    },
    service = MVCActionCommand.class
)
public class SaveComputerActionCommand extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {

		long computerId = ParamUtil.getLong(actionRequest, "computerId");
		String company = ParamUtil.getString(actionRequest, "company");
		String modelName = ParamUtil.getString(actionRequest, "modelName");
		String operatingSystem = ParamUtil.getString(actionRequest, "operatingSystem");
		double cost = ParamUtil.getDouble(actionRequest, "cost");
		int rating = ParamUtil.getInteger(actionRequest, "rating");

		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);

		Computer computer = null;
		if (computerId > QueryUtil.ALL_POS) {
			computer = _computerLocalService.fetchComputer(computerId);
		}

		if (computer == null) {
			computer = _computerLocalService.createComputer(computerId);
		}

		computer.setCompany(company);
		computer.setModelName(modelName);
		computer.setOperatingSystem(operatingSystem);
		computer.setCost(cost);
		computer.setRating(rating);

		User loggedInUser = themeDisplay.getUser();

		if (_log.isDebugEnabled()) {
			_log.debug("User Id :" + loggedInUser.getUserId() + ", CompanyId :" + themeDisplay.getCompanyId()
					+ ", ScoprGroupId :" + themeDisplay.getScopeGroupId());
		}

		computer.setUserId(loggedInUser.getUserId());
		computer.setUserName(loggedInUser.getFullName());
		computer.setUserUuid(loggedInUser.getUserUuid());
		computer.setCompanyId(themeDisplay.getCompanyId());
		computer.setGroupId(themeDisplay.getScopeGroupId());

		// Update createDate on time of creation
		Date now = new Date();
		computer.setCreateDate(now);
		computer.setModifiedDate(now);

		actionRequest.setAttribute("isEdit", true);
		
		try {
			_computerLocalService.updateComputerModel(computer);
		} catch (PortalException e) {
			_log.error("Error while updating computer :" + e.getMessage(), e);

			// error message
			hideDefaultErrorMessage(actionRequest);
			SessionErrors.add(actionRequest, "error-something-went-wrong");
		}
	}

	private static Log _log = LogFactoryUtil.getLog(SaveComputerActionCommand.class);

	@Reference
	private ComputerLocalService _computerLocalService;
}
