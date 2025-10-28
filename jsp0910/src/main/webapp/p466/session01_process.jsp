<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션</title>
</head>
<body>
	<%
		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");
		
		if(id.equals("admin") && passwd.equals("1234")) {
			session.setAttribute("UserID", id);
			session.setAttribute("UserPW", passwd);
			out.println("세션 설정이 성공했습니다.<br>");
			out.println(id + "님 환영합니다.");
		} else {
			out.println("세션 설정이 실패했습니다.");
		}
	%>
</body>
</html>