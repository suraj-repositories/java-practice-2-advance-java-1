<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

  <h6>out : 		<%= out %></h6>
  <h6>request : 	<%= request %></h6>
  <h6>response : 	<%= response %></h6>
  <h6>session :		<%= session == request.getSession()  %></h6>
  <h6>application : <%= application == getServletContext()  %></h6>
  <h6>config : 		<%= config == getServletConfig()  %></h6>
  <h6>page : 		<%= page == this %></h6>
  <h6>pageContext	<%= pageContext %></h6>
 
   
  
 
 

</body>
</html>