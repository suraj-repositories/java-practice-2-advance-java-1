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
	
	<!-- NOW THIS WILL WORK EITHER COOKIES ARE ALLOWED OR BLOCKED -->
	<!-- BASICALLY IT BINDS THE JSESSION ID WITH THE LINK  -->
	<!-- YOU CAN DO THIS FOR ALL LINKS  -->
	<!-- BENIFIT IS THAT YOU CAN MANNAGE SESSION EITHER THE COOKIES ARE BLOCKED OR ALLOWED -->
	
	<form action='<%= response.encodeURL("save-contact") %>' method="post">
	
	User Name : <input type="text" placeholder="user name" name="name">
	<br><br>
	Phone NO : <input type="number" name="number" placeholder="phone number">
	<br><br>
	<input type="submit" value="Save Contact">
	<br><br>
	</form>
	
	
	<a href='<%= response.encodeURL("show") %>'>Show Contacts</a>
	
</body>
</html>