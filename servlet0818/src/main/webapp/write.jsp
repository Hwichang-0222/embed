<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dept Table Input</title>
</head>
<body>
	<h2>Dept Table Input</h2>
	<form action="write.do" method="post">
		Dept No : <input type="text" name="deptno" required><br>
		Dept Name : <input type="text" name="dname" required><br>
		Location : <input type="text" name="loc" required><br>
		<input type="submit" value="Save">
	</form>
</body>
</html>