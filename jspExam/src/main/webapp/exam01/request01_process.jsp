<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Implicit Objects</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
		String userid = request.getParameter("id");
		String passwd = request.getParameter("pwd");
	%>
	
	아 이 디 : <%=userid %> <br>
	비밀번호 : <%=passwd %> <br>

</body>
</html>