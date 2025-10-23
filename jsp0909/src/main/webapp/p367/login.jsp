<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인폼(form) 인증</title>
</head>
<body>
	<form action="j_security_check" method="post" name="loginForm">
			ID : <input type="text" name="j_username"><br>
			PW : <input type="password" name="j_password"><br>
			<input type="submit" value="send"><br>
			
	</form>

</body>
</html>