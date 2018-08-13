<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title></title>
</head>
<body>

	<form:form action="processForm" modelAttribute="Adventurer">

		First Name<form:input path="fistName" />
		Last Name<form:input path="lastName" />
		<input type="submit" value="submit" />

	</form:form>
	
</body>
</html>