<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<hr>
<h1>Index.jsp file</h1>
<hr>
<a href="link">This is a link</a>
<br>

<div>

<!-- DECLARATION -->
<%!		// in instance level(class level)
	public int sayHello(int number){		// we can use this method anywhere in program because it is in class level
	 	return number*2;
	}

%>
<%= sayHello(5) %>		<!-- it is go on -> out.write(here); --> 


<!-- SCTIPT LIT -->
<%	// you can write java & html both in jsp file (inside method(method level))

	

	System.out.println("hello world");
	int i=90;
	int j=89;
	System.out.println("sum = " +(i+j));

	
	out.write("This writes on html"); 
%>

<%
	int arr[] = new int[]{25,12,45,63,48,45};
	
	for(int index : arr){%>
		<%= index %> 		<!--  initialize -->
	<%}


%>

<!-- Directive == use for import statements --> <!-- below is page directive -->
<%@ page import = "java.util.Date , java.util.Scanner , java.lang.* " %>

</div>
<%= new Date() %> 	<!--  using the directive  -->


<h3> -- Got it --</h3>
</body>
</html>