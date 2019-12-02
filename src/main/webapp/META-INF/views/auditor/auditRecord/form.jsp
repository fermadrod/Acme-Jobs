<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-textbox code="auditor.auditRecord.form.label.title" path="title"/>
	<acme:form-moment code="auditor.auditRecord.form.label.creationMoment" path="creationMoment"/>
	<acme:form-textarea code="auditor.auditRecord.form.label.body" path="body"/>
	<acme:form-checkbox code="auditor.auditRecord.form.label.status" path="status"/>
	
		<acme:form-return code="auditor.auditRecord.form.button.return"/>
</acme:form>
