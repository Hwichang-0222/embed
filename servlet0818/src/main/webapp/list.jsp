<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dept Table Page</title>
	<style>
		#container {
			width: 600px;
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
	<h1>Dept Table View</h1>
	<div id="container">
		<table>
			<tr>
				<td>Dept No</td>
				<td>Dept Name</td>
				<td>Location</td>
			</tr>
			<c:forEach var="dept" items="${list}" step="1">
				<tr>
					<td>${dept.deptno}</td>
					<td>${dept.dname}</td>
					<td>${dept.loc}</td>
				</tr>
			</c:forEach>
		</table>
		<form action="writeui.do">
			<input type="submit" value="add value">
		</form>
		<form action="deleteui.do">
			<input type="submit" value="delect">
		</form>
	</div>
</body>
</html>