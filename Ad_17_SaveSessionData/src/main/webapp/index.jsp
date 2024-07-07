<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!--  Action is the url-pattern in which servelt are mapped -->>
	<form action="save-name" method="get">
	
		User Name : <input type="text" name="username"> 
		<br>
		<br>
		<input type="submit" value="Save My name">
		<br><hr><br>
	 
	</form>
	
	<!-- This href is also the url-pattern in which servelt are mapped -->
	<a href="showMyName">Show My Name</a>
	
</body>
</html>