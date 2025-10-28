<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Table Page</title>
	<style>
		#container {
			width: 800px;
			height: 400px;
			margin: 10px auto;
		}
		
		table, td {
			border: 1px solid #222222;
			border-collapse: collapse;
			padding: 10px;
			text-align: center;
		}
	</style>
</head>
<body>
	<div id="container">
		<table>
			<caption>Employee Information</caption>
			<tr>
				<td>Employee No</td>
				<td>Employee Name</td>
				<td>Job</td>
				<td>Mgr</td>
				<td>Hiredate</td>
				<td>Sal</td>
				<td>Comm</td>
				<td>Deptno</td>				
			</tr>
			
			<c:forEach var="emp" items="${empList}" step="1">
				<tr>
					<td>${emp.empno}</td>
					<td>${emp.ename}</td>
					<td>${emp.job}</td>
					<td>${emp.mgr}</td>
					<td>${emp.hiredate}</td>
					<td>${emp.sal}</td>
					<td>${emp.comm}</td>
					<td>${emp.deptno}</td>
				</tr>
			</c:forEach>
		</table>
		<form action="empwriteui.co">
			<input type="submit" value="add value">
		</form>
		<form action="empdeleteui.co">
			<input type="submit" value="delect">
		</form>
	</div>
</body>
</html>