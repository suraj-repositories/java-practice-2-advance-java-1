<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Contact Manager</h1>
	
	
	<form action="save-contact" method="post">
	
	User Name : <input type="text" placeholder="user name" name="name">
	<br><br>
	Phone NO : <input type="number" name="number" placeholder="phone number">
	<br><br>
	<input type="submit" value="Save Contact">
	<br><br>
	</form>
	
	
	<a href="show">Show Contacts</a>
	
</body>
</html>