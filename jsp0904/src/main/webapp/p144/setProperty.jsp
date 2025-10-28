<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>setProperty.jsp</title>
</head>
<body>
	<jsp:useBean id="person" class="org.embed.dto.Person" scope="request"/>
	<jsp:setProperty property="id" name="person" value="20250904"/>
	<jsp:setProperty property="name" name="person" value="dad"/>
	<p>ID : <%=person.getId() %></p>
	<p>Name : <%=person.getName() %></p>
</body>
</html>