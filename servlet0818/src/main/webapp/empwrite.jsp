<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Table Input</title>
</head>
<body>
	<h2>Employee Table Input</h2>
	<form action="empwrite.co" method="post">
		Employee No : <input type="text" name="empno" required><br>
		Employee Name : <input type="text" name="ename" required><br>
		Job : <input type="text" name="job" required><br>
		Mgr : <input type="text" name="mgr" required><br>
		Hiredate : <input type="date" name="hiredate" required><br>
		Sal : <input type="text" name="sal" required><br>
		Comm : <input type="text" name="comm" required><br>
		Deptno : <input type="text" name="deptno" required><br>
		<input type="submit" value="Save">
	</form>
</body>
</html>