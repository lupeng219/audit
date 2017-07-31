<%@page import="com.crdloo.audit.web.example.form.ExampleForm"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
ExampleForm example = (ExampleForm)request.getAttribute("exampleForm");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>example data.jsp</title>
</head>
<body>
id:<%=example.getId() %><br>
name:<%=example.getName() %>
</body>
</html>