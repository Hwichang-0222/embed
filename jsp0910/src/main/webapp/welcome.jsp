<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    String userID = (String)session.getAttribute("userID");

    if(userID == null) {
        response.sendRedirect("session_out.jsp");
        return;
    }
%>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome Page</title>
</head>
<body>
    <h2><%= userID %>님, 환영합니다!</h2>
    <form action="session_out.jsp" method="post">
        <input type="submit" value="로그아웃">
    </form>
</body>
</html>
