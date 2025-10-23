<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>회원 목록</title>
<link rel="stylesheet" href="css/common.css">
</head>
<body>
	<header class="header">
		<div class="container">
			<h1>회원 목록</h1>
			<nav class="nav-links">
				<c:choose>
					<c:when test="${not empty sessionScope.loginId}">
						<a href="logOut.ddo" class="nav-link">로그아웃</a>
					</c:when>
					<c:otherwise>
						<a href="loginUI.ddo" class="nav-link">로그인</a>
					</c:otherwise>
				</c:choose>
				<a href="index.ddo" class="nav-link">메인화면</a>
			</nav>
		</div>
	</header>
	
	<main class="container">
		<section class="card">
			<div class="table-container">
				<table class="data-table">
					<thead>
						<tr>
							<th>아이디</th>
							<th>패스워드</th>
							<th>이름</th>
							<th>성별</th>
							<th>생일</th>
							<th>이메일</th>
							<th>연락처</th>
							<th>주소</th>
							<th>가입일</th>
							<th>수정</th>
							<th>삭제</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="mDto" items="${memberList}">
							<tr>
								<td>${mDto.id}</td>
								<td>${mDto.password}</td>
								<td>${mDto.name}</td>
								<td>${mDto.gender}</td>
								<td>${mDto.birth}</td>
								<td>${mDto.mail}</td>
								<td>${mDto.phone}</td>
								<td>${mDto.address}</td>
								<td>${mDto.regist_day}</td>
								<td>
									<a href="mUpdateUI.do?id=${mDto.id}" class="action-link">수정</a>
								</td>
								<td>
									<a href="mDeleteUI.do?id=${mDto.id}" class="action-link action-link-danger">삭제</a>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</section>
	</main>
</body>
</html>