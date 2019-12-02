<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-textbox code="employer.dutys.form.label.title" path="title"/>
	<acme:form-moment code="employer.dutys.form.label.description" path="description"/>
	<acme:form-money code="employer.dutys.form.label.percentaje" path="percentaje"/>

	
	<acme:form-return code="employer.job.form.button.return"/>
</acme:form>
