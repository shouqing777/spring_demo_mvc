<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<style>
		.error {color:red}
	</style>
<title>Insert title here</title>
</head>
<body>

	<form:form action="processForm" modelAttribute ="customer" method="get">

		FirstName<form:input path="firstName" />
		<hr>
		LastName<form:input path="lastName" />
		<form:errors path="lastName" cssClass="error" />
		<hr>
		freePasses<form:input path="freePasses" />
		<form:errors path="freePasses" cssClass="error" />
		<hr>
		postCode<form:input path="postCode" />
		<form:errors path="postCode" cssClass="error" />
		<hr>
		<input type="submit" value="submit">

	</form:form>
	
</body>
</html>