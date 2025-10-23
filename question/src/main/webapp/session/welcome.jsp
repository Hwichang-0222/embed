<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
    String userID = (String) session.getAttribute("userID");
    if (userID == null) {
        response.sendRedirect("session_out.jsp");
        return;
    }
%>
 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>
	<h2>환영합니다, <%= userID %>님!</h2>
	<form action="session_out.jsp" method="post">
		<input type="submit" value="로그아웃">
	</form>
</body>
</html>