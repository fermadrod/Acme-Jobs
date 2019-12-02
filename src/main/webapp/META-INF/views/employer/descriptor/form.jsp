<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-textbox code="employer.descriptor.form.label.description" path="description"/>
	<acme:form-submit code="employer.descriptor.form.button.dutys"
				  method="get" action="/employer/dutys"/>

	<acme:form-return code="employer.descriptor.form.button.return"/>
</acme:form>
