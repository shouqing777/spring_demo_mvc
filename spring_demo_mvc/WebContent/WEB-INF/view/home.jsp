<!DOCTYPE html>
<html>
<head>
	<title>hello spring</title>
	
	<link rel="stylesheet" type="text/css" 
		  href="${pageContext.request.contextPath}/resources/css/test.css">
    <script src="${pageContext.request.contextPath}/resources/js/test.js"></script> 
    
</head>

<body>
	<h2>hello spring</h2>
	
	<a href="param/nameForm">Parameter Form</a>
	
	<img src="${pageContext.request.contextPath}/resources/images/spring.png">
	
	<input type="button" onclick="doSomeThing()" value="Click Me"/>
</body>
</html>