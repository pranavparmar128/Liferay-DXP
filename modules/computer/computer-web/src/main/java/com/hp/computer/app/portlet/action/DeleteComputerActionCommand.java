package com.hp.computer.app.portlet.action;

import com.hp.computer.app.portlet.constants.ComputerApplicationPortletKeys;
import com.hp.computer.app.service.ComputerLocalService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
	immediate = true, 
	property = { 
			"javax.portlet.name=" + ComputerApplicationPortletKeys.COMPUTERAPPLICATION,
			"mvc.command.name=/delete/computer" }, 
	service = MVCActionCommand.class
)
public class DeleteComputerActionCommand extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {

		long computerId = ParamUtil.getLong(actionRequest, "computerId");

		try {
			_computerLocalService.deleteComputerModel(computerId);
		} catch (PortalException e) {
			_log.error("Error while deleting computer :" + e.getMessage(), e);

			// error message
			hideDefaultErrorMessage(actionRequest);
			SessionErrors.add(actionRequest, "error-something-went-wrong");
		}

	}

	private static Log _log = LogFactoryUtil.getLog(DeleteComputerActionCommand.class);

	@Reference
	private ComputerLocalService _computerLocalService;
}
