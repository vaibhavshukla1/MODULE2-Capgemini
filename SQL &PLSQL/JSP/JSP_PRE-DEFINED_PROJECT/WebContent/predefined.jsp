<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%--exception --%>
<%@ page isErrorPage="true" %>  
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%--using pre-define objects in jsp --%>

<%--out --%>
<% out.print(3*3); %>

<%--creating exception --%>
Sorry following exception occured:<%= exception %>  
</body>
</html>