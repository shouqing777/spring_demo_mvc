<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>Adventurer-confirm</title>
</head>
<body>

first name : ${adventurer.firstName}
<hr>
last name : ${adventurer.lastName}
<hr>
country : ${adventurer.country}
<hr>
skill : ${adventurer.skill}
<hr>
race : ${adventurer.race}
<hr>
weapon: ${adventurer.weapon}
<hr>
armor:
	<ul>
		<c:forEach var="temp" items="${adventurer.armor}">
			<li>${temp} </li>
		</c:forEach>
	</ul>

</body>
</html>