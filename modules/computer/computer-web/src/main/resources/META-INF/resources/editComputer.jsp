<%@ include file="/init.jsp" %>

<portlet:actionURL name="/save/computer" var="saveComputerURL" />

<aui:form action="<%=saveComputerURL%>" cssClass="container-fluid-1280" method="post" name="computerForm">
	<aui:input name="computerId" type="hidden" value="${computer.computerId}" />
	<aui:fieldset-group markupView="lexicon">
		<aui:fieldset>
			<liferay-ui:header title="lbl-computer-info"/>
			<aui:input name="company" label="lbl-company-name" required="<%=true%>" type="text" value="${computer.company}" wrapperCssClass="col-md-4 d-inline-block" />
			<aui:input name="modelName" label="lbl-model-name" required="<%=true%>" type="text" value="${computer.modelName}" wrapperCssClass="col-md-4 d-inline-block" />
			
			<aui:select name="operatingSystem" label="lbl-operating-system" wrapperCssClass="col-md-3 d-inline-block" required="<%=true%>">
				<aui:option value=""><liferay-ui:message key="lbl-please-select" /></aui:option>
				<c:forEach items="${osTypeMap}" var="osType">
			        <aui:option value="${osType.key}" selected="${osType.key eq computer.operatingSystem}">${osType.value}</aui:option>
			    </c:forEach>
			</aui:select>

			<aui:input name="cost" label="lbl-cost" required="<%=true%>" type="text" value="${computer.cost}" wrapperCssClass="col-md-4 d-inline-block">
				<aui:validator name="number" />
			</aui:input>
			<aui:input name="rating" label="lbl-rating" required="<%=true%>" type="text" value="${computer.rating}" wrapperCssClass="col-md-4 d-inline-block">
				<aui:validator name="range">[1,10]</aui:validator>
			</aui:input>
		</aui:fieldset>
	</aui:fieldset-group>
	
	<aui:button-row>
		<aui:button type="submit" value="lbl-save-computer" />
		<aui:button value="lbl-cancel" cssClass="btn btn-default" href="<%=renderResponse.createRenderURL().toString()%>" />
	</aui:button-row>
</aui:form>
