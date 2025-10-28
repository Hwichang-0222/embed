<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>getProperty.jsp</title>
</head>
<body>
	<jsp:useBean id="person" class="org.embed.dto.Person" scope="request"/>
	
	<p>ID : <jsp:getProperty property="id" name="person"/>
	
	<p>Name :<jsp:getProperty property="name" name="person"/>
</body>
</body>
</html>