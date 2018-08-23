<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title></title>
</head>
<body>

	<form:form action="processForm" modelAttribute="adventurer">


		First Name: <form:input path="firstName"/>
		<hr>
		Last Name: <form:input path="lastName"/>
		<hr>

		country :
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
		
		weapon:
			<form:radiobutton path="weapon" value="blade"/> blade
			<form:radiobutton path="weapon" value="sword"/> sword
			<form:radiobutton path="weapon" value="staff"/> staff
		<hr>
		
		armor
			<form:checkbox path="armor" value = "armor"/> armor
			<form:checkbox path="armor" value = "leather"/> leather
			<form:checkbox path="armor" value = "cloth"/> cloth
		<hr>
			
		<input type="submit" value="submit"/>
		
	</form:form>
<body>
</body>
</html>


