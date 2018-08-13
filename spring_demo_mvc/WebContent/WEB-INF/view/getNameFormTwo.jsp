<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>get Parameter Form</title>
</head>

<body>

<br>
	<%
		String param = request.getParameter("name");

		if (param != null) {
			param = param.toUpperCase();
		}
	%>
	jsp language:
	<%=param%>
	<hr>
	jsp el language:
	${param.name}
	<hr>
	
	spring:upperName:${upperName}
	
</body>

</html>