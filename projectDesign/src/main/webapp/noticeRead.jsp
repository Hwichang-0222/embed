<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>공지사항 상세보기</title>
<link rel="stylesheet" href="css/common.css">
<style>
.detail-table {
	width: 100%;
	border-collapse: collapse;
}
.detail-table th {
	background: #f8f9fa;
	padding: 15px;
	text-align: left;
	font-weight: bold;
	width: 150px;
	border-bottom: 1px solid #ddd;
}
.detail-table td {
	padding: 15px;
	border-bottom: 1px solid #ddd;
}
.detail-table tr:last-child th,
.detail-table tr:last-child td {
	border-bottom: none;
}
.content-cell {
	white-space: pre-line;
	line-height: 1.8;
	min-height: 200px;
}
</style>
</head>
<body>
	<header class="header">
		<div class="container">
			<h1>공지사항 상세보기</h1>
			<nav class="nav-links">
				<a href="noticeListPage.too" class="nav-link">공지사항 목록</a>
				<a href="index.ddo" class="nav-link">메인화면</a>
			</nav>
		</div>
	</header>

	<main class="container">
		<section class="card">
			<h2 class="card-title">${nData.title}</h2>
			<div class="table-container">
				<table class="detail-table">
					<tbody>
						<tr>
							<th>글 번호</th>
							<td>${nData.no}</td>
						</tr>
						<tr>
							<th>작성자</th>
							<td>${nData.writer}</td>
						</tr>
						<tr>
							<th>조회수</th>
							<td>${nData.count}</td>
						</tr>
						<tr>
							<th>작성일</th>
							<td>${nData.write_day}</td>
						</tr>
						<tr>
							<th>상태</th>
							<td>
								<c:choose>
									<c:when test="${nData.status == 'new'}">새글</c:when>
									<c:when test="${nData.status == 'modified'}">수정글</c:when>
									<c:otherwise>${nData.status}</c:otherwise>
								</c:choose>
							</td>
						</tr>
						<tr>
							<th>내용</th>
							<td class="content-cell">${nData.content}</td>
						</tr>
					</tbody>
				</table>
			</div>

			<c:if test="${sessionScope.loginId == 'admin'}">
				<div class="mt-20 text-center">
					<a href="noticeUpdateRetrieve.too?no=${nData.no}" class="btn btn-primary">수정</a>
					<a href="noticeDelete.too?no=${nData.no}" class="btn btn-danger" onclick="return confirm('정말 삭제하시겠습니까?');">삭제</a>
				</div>
			</c:if>
		</section>
	</main>
</body>
</html>