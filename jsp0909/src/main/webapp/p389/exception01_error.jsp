<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Exception</title>
</head>
<body>
	<h3>오류가 발생했습니다.</h3>
	예외 : <%=exception %> <br>
	toSring() : <%=exception.toString() %> <br>
	getClass().getName() : <%=exception.getClass().getName() %> <br>
	getMessage() : <%=exception.getMessage() %> <br>
</body>
</html>