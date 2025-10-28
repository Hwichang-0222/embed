<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Form</title>
</head>
<body>
	<h2><a href="memberLoginui.do">Login View</a></h2>
	<% String error = (String) request.getAttribute("error"); %>
	<% if (error != null) { %>
    <p style="color:red;"><%= error %></p>
	<% } %>
	
	<form action="memberLogin.do" method="post">
		<fieldset>
			<legend>Login Field</legend>
			ID <input type="text" id="id" name="id" autofocus required><br>
			PW <input type="password" id="pwd1" name="password1" required><br>
			<input type="submit" value="Login">
			<input type="button" value="member" onclick="location.href='memberAddui.do'">
		</fieldset>
	</form>
</body>
</html>