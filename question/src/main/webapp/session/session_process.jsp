<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>session</title>
</head>
<body>

	<%
		String user_id = request.getParameter("id");
		String user_pw = request.getParameter("password");
	
		if(user_id.equals("admin") && user_pw.equals("1111")) {
			session.setAttribute("userID", user_id);
			session.setAttribute("userPW", user_pw);
			
			response.sendRedirect("welcome.jsp");
		} else {
			 out.println("<script>alert('아이디 또는 비밀번호가 틀렸습니다.'); history.back();</script>");

		}
		
	%>

</body>
</html>