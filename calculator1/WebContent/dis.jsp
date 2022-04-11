<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String username=request.getParameter("username");
String password=request.getParameter("password");
%> 
<%-- <% if (password=="123456"){
	PrintWriter printWriter=response.getWriter();
	printWriter.println("<h1> Welcome  to result </h1>");
}
%> --%>
<h1 style="font-size:60px;color:green">WELCOME </h1><h1 style="font-size:60px;color:yellow">:)</h1>
<h2><%=username%></h2>
</body>
</html>