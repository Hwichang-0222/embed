<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
    String userID = null; 
    Cookie[] cookies = request.getCookies();
    
    if (cookies != null) {
        for (Cookie c : cookies) {
        	if (c.getName().equals("userID")) {
        		userID = c.getValue();
        		break;
        	}
        }
    }
    
    if (userID == null) {
	    response.sendRedirect("cookie_out.jsp");
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
	<form action="cookie_out.jsp" method="post">
		<input type="submit" value="로그아웃">
	</form>
</body>
</html>