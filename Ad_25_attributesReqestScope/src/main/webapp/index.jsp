<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p><b>first go to /abc :</b>> your request is generated , we add attribute , and forword it to jsp file
		,response is sended to user , object distroyed(attribute also)
	</p>
	<p><b> go to /xyz :</b>new object will created , it don't have any attribute at this time,so when we try to 
	show previous object attribute it returns null; 
	</p>
</body>
</html>