<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>useBean.jsp</title>
</head>
<body>
	<jsp:useBean id="person" class="org.embed.dto.Person" scope="request"></jsp:useBean>
	<p>ID : <%=person.getId() %></p>
	<p>Name : <%=person.getName() %></p>
	<%
		person.setId(20250904);
		person.setName("kim");
	%>
	
	<p>ID : <%=person.getId() %></p>
	<p>Name : <%=person.getName() %></p>
</body>
</html>