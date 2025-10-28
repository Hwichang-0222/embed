<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션유지</title>
</head>
<body>
	<%
		String id = (String)session.getAttribute("UserID");
		String passwd = (String)session.getAttribute("UserPW");
		
		out.println("설정된 세션의 속성 값 [1] : " + id + "<br>");
		out.println("설정된 세션의 속성 값 [2] : " + passwd + "<br>");
	%>
</body>
</html>