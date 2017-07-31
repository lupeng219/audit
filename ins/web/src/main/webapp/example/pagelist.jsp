<%@page import="java.util.List"%>
<%@page import="com.crdloo.audit.web.example.form.ExampleForm"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
List<ExampleForm> exampleFormList = (List<ExampleForm>)request.getAttribute("list");
Long count = (Long)request.getAttribute("count");
Integer totalPage = (Integer)request.getAttribute("totalPage");
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>example pagelist.jsp</title>
</head>
<body>
list:<br/>
<%
	for(ExampleForm form : exampleFormList) {
%>
		id:<%=form.getId() %>, name:<%=form.getName() %><br/>
<%
	}
%>
count:<%=count %><br/>
totalPage:<%=totalPage %><br/>
</body>
</html>