
<%@ page import = "java.util.Random" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>FAKE MOBILE NUMBER'S</h1>
	
	<table border="1" >
	<%
		Random random = new Random();
		
	
		for(int i=0 ; i<20 ; i++){
			String number = "+9198"+((random.nextDouble() + "").substring(2,10));
			
	%>
			<tr>
				<td>
					<%= number %>
				</td>
			</tr>
	<% } %>
	
	</table>

</body>
</html>