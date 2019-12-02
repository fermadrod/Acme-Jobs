<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-textbox code="worker.application.form.label.reference" path="reference"/>
	<acme:form-moment code="worker.application.form.label.moment" path="moment"/>
	<acme:form-textarea code="worker.application.form.label.skills" path="skills"/>
	<acme:form-textarea code="worker.application.form.label.qualifications" path="qualifications"/>
	<acme:form-textarea code="worker.application.form.label.statements" path="statements"/>
	<acme:form-textbox code="worker.application.form.label.status" path="status"/>
	<div>
	<label><acme:message code="worker.application.form.label.worker"/></label><br>
	<a class="form-control"> <jstl:out value="${worker.userAccount.username}"/></a>
	</div>
	<div>
	<label><acme:message code="worker.application.form.label.job"/></label><br>
	<a class="form-control"> <jstl:out value="${job.title}"/></a>
	</div>
	<acme:form-return code="worker.application.form.button.return"/>
</acme:form>
