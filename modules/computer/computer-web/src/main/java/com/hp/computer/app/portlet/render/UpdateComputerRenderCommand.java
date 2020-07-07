package com.hp.computer.app.portlet.render;

import com.hp.computer.app.model.Computer;
import com.hp.computer.app.portlet.constants.ComputerApplicationPortletKeys;
import com.hp.computer.app.portlet.enums.OperatingSystem;
import com.hp.computer.app.service.ComputerLocalService;
import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.util.ParamUtil;

import java.util.HashMap;
import java.util.Map;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
		property = {
			"javax.portlet.name=" + ComputerApplicationPortletKeys.COMPUTERAPPLICATION,
			"mvc.command.name=/edit/computer"
	},
	service = MVCRenderCommand.class
)
public class UpdateComputerRenderCommand implements MVCRenderCommand {

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {

		long computerId = ParamUtil.getLong(renderRequest, "computerId", QueryUtil.ALL_POS);

		Computer computer = null;
		if (computerId > QueryUtil.ALL_POS) {
			computer = _computerLocalService.fetchComputer(computerId);
		}

		if (computer == null) {
			computer = _computerLocalService.createComputer(_counterLocalService.increment(Computer.class.getName()));
		}

		renderRequest.setAttribute("computer", computer);

		Map<String, String> osTypeMap = new HashMap<String, String>();
		for (OperatingSystem type : OperatingSystem.values()) {
			osTypeMap.put(type.getValue(), type.getValue());
		}
		renderRequest.setAttribute("osTypeMap", osTypeMap);

		return "/editComputer.jsp";
	}

	@Reference
	private ComputerLocalService _computerLocalService;

	@Reference
	private CounterLocalService _counterLocalService;
}
