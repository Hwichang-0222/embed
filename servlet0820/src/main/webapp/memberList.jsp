<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Member Table Page</title>
	<style>
		#container {
			width: 1000px;
			height: auto;
			margin: 10px auto;
		}
		
		table, td {
			border: 1px solid #222222;
			border-collapse: collapse;
			padding: 10px;
			text-align: center;
		}
		
		#deleteForm {
			display: none;
		}
	</style>
</head>
<body>
	<h1>Dept Table View</h1>
	<div id="container">
		<table>
			<tr>
				<td>ID</td>
				<td>Id check</td>
				<td>Password1</td>
				<td>Password2</td>
				<td>Name</td>
				<td>Tel</td>
				<td>Email</td>
				<td>Birthday</td>
				<td>Homepage</td>
				<td>Gender</td>
			</tr>
			<c:forEach var="member" items="${memberList}" step="1">
				<tr>
					<td>${member.id}</td>
					<td>${member.idchk}</td>
					<td>${member.password1}</td>
					<td>${member.password2}</td>
					<td>${member.name}</td>
					<td>${member.tel}</td>
					<td>${member.email}</td>
					<td>${member.birthday}</td>
					<td>${member.homepage}</td>
					<td>${member.gender}</td>
				</tr>
			</c:forEach>
		</table>
		<form action="memberAddui.do">
			<input type="submit" value="add Member">
		</form>
		<button type="button" onclick="showDeleteForm()">Delete</button>
		<form action="memberDelete.do" method="post" id="deleteForm">
			ID : <input type="text" name="id2" required><br>
		<input type="submit" value="delete">
		</form>
		<button onclick="location.href='memberLoginui.do'">Log out</button>
	</div>
	<script>
	function showDeleteForm() {
        document.getElementById("deleteForm").style.display = "block";
    }
	</script>
</body>
</html>
