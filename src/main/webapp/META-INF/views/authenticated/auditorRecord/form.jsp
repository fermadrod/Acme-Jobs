<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-textbox code="authenticated.authenticatedRecord.form.label.title" path="title"/>
	<acme:form-moment code="authenticated.authenticatedRecord.form.label.moment" path="moment"/>
	<acme:form-textarea code="authenticated.authenticatedRecord.form.label.body" path="body"/>
	<div>
	<label><acme:message code="authenticated.authenticatedRecord.form.label.username"/></label><br>
	<a class="form-control"> <jstl:out value="${auditor.userAccount.username}"/></a>
	</div>
	<div>
	<label><acme:message code="authenticated.authenticatedRecord.form.label.job"/></label><br>
	<a class="form-control"> <jstl:out value="${job.title}"/></a>
	</div>
	<acme:form-return code="authenticated.authenticatedRecord.form.button.return"/>
</acme:form>
