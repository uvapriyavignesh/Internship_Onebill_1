<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>RESULT</title>
</head>
<body>
	<%
		Integer a = Integer.parseInt(request.getParameter("a"));
		Integer b = Integer.parseInt(request.getParameter("b"));
	%>
	
	<h1>
		Result of<%=a%>+<%=b%>=<%=a + b%></h1>
	<h1>
		Result of<%=a%>-<%=b%>=<%=a - b%></h1>
	<h1>
		Result of<%=a%>*<%=b%>=<%=a * b%></h1>
	<h1>
		Result of<%=a%>/<%=b%>=<%=a / b%></h1>

</body>
</html>