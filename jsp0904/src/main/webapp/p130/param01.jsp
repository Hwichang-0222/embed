<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>param01.jsp</title>
	</head>
	<body>
		<h3>param 액션 태그</h3>
		<jsp:forward page="param01_data.jsp">
			<jsp:param value="admin" name="id"/>
			<jsp:param value="관리자" name="name"/>
		</jsp:forward>
		<p>Java Server Page</p>
	</body>
</html>