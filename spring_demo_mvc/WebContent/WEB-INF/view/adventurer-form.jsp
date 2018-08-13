<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title></title>
</head>
<body>

	<form:form action="processForm" modelAttribute="adventurer">


		First Name: <form:input path="firstName"/>
		<br>
		<hr>
		Last Name: <form:input path="lastName"/>
		<br>
		

		<hr>
		Country : 		
		<form:select path="country">
			
			<form:option value="american" label="american"/>
			<form:option value="taiwan" label="taiwan"/>
			<form:option value="japan" label="japan"/>					
		
		</form:select>
		
		<hr>
		skill:
		<form:select path="skill">
			<form:options items="${adventurer.skills}"/>	
		</form:select>		
		<hr>
		race:
		<form:select path="race">
			<form:options items="${race}"/>	
		</form:select>	
		<hr>
		<input type="submit" value="submit"/>
		
	</form:form>
<body>
</body>
</html>


