<%@ include file="/init.jsp" %>

<portlet:renderURL var="addComputerURL">
	<portlet:param name="mvcRenderCommandName" value="/edit/computer" />
	<portlet:param name="computerId" value="-1" />
	<portlet:param name="isEdit" value="true" />
</portlet:renderURL>

<liferay-ui:error key="error-something-went-wrong" message="error-something-went-wrong" />
<liferay-ui:error key="error-search-exception" message="error-search-exception" />

<aui:button type="button" value="lbl-add-computer" href="${addComputerURL}" cssClass="btn-primary search-btn" /></br>


<portlet:renderURL var="searchURL"></portlet:renderURL>

<aui:form action="<%= searchURL %>" name="fm">

    <div class="search-form">
       	<aui:input label="" name="keywords" size="30"  type="text"	value="${keywords}" />
		<aui:button type="submit" value="lbl-search" />
		<c:if test="${not empty keywords}">
			<aui:button type="button" value="lbl-clear" href="${searchURL}" />
		</c:if>
    </div>
</aui:form>

<liferay-ui:search-container total="${computerListCount}" emptyResultsMessage="msg-no-computer" delta="5" deltaConfigurable="true">

	<liferay-ui:search-container-results results="${computerList}" />
	
	<liferay-ui:search-container-row
		className="com.hp.computer.app.model.Computer"
		keyProperty="computerId"
		modelVar="computer"
		>
		
	<liferay-ui:search-container-column-text
		cssClass="table-cell-expand-small table-title"
		name="lbl-company-name"
		orderable="<%= true %>"
		property="company"
	/>
	
	<liferay-ui:search-container-column-text
		cssClass="table-cell-expand-small table-title"
		name="lbl-model-name"
		orderable="<%= true %>"
		property="modelName"
	/>
	
	<liferay-ui:search-container-column-text
		cssClass="table-cell-expand-small table-title"
		name="lbl-operating-system"
		orderable="<%= true %>"
		property="operatingSystem"
	/>
		
	<liferay-ui:search-container-column-text
		cssClass="table-cell-expand-small table-title"
		name="lbl-cost"
		orderable="<%= true %>"
		property="cost"
	/>
		
	<liferay-ui:search-container-column-text
		cssClass="table-cell-expand-small table-title"
		name="lbl-rating"
		orderable="<%= true %>"
		property="rating"
	/>
	
	<portlet:renderURL var="editComputerURL">
		<portlet:param name="mvcRenderCommandName" value="/edit/computer" />
		<portlet:param name="computerId" value="<%= String.valueOf(computer.getComputerId()) %>" />
	</portlet:renderURL>

	<portlet:actionURL name="/delete/computer" var="deleteComputerURL">
		<portlet:param name="computerId" value="<%= String.valueOf(computer.getComputerId()) %>" />
	</portlet:actionURL>

	<liferay-ui:search-container-column-text name="">
		<liferay-ui:icon-menu
				direction="left-side"
				icon=""
				markupView="lexicon"
				message=""
				showWhenSingleIcon="<%= true %>"
			>
			<liferay-ui:icon
				message="edit"
				method="post"
				url="<%= editComputerURL %>"
			/>
			<liferay-ui:icon
				message="delete"
				method="get"
				url="<%= deleteComputerURL %>"
			/>
		</liferay-ui:icon-menu>
	</liferay-ui:search-container-column-text>
	
	</liferay-ui:search-container-row>
	
	<liferay-ui:search-iterator
		displayStyle="list"
		markupView="lexicon"
	/>
</liferay-ui:search-container>