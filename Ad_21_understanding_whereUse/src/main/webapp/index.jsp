<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- ---------------------------------------------------------------- -->
<h1>hello world</h1>					<!-- #1 same : preferred--> 

<% 
	out.write("<h1>hello world <h1>"); 		// #1 same : use smallest syntax
%>

<!-- ---------------------------------------------------------------- -->

<% out.write(25+45+""); %>		 <!-- #2 same -->
<%= 20+45 %>					<!-- #2 same : preferred -->


</body>
</html>