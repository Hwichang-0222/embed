<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>공지사항 목록</title>
<link rel="stylesheet" href="css/common.css">
</head>
<body>
	<header class="header">
		<div class="container">
			<h1>공지사항 목록</h1>
			<nav class="nav-links">
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
							<th>글 번호</th>
							<th>공지사항 제목</th>
							<th>작성자</th>
							<th>조회수</th>
							<th>작성일</th>
							<th>상태</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="nDto" items="${noticeList}">
							<tr>
								<td>${nDto.no}</td>
								<td><a href="noticeRead.too?no=${nDto.no}">${nDto.title}</a></td>
								<td>${nDto.writer}</td>
								<td>${nDto.count}</td>
								<td>${nDto.write_day}</td>
								<td>
									<c:choose>
										<c:when test="${nDto.status == 'new'}">새글</c:when>
										<c:when test="${nDto.status == 'modified'}">수정글</c:when>
										<c:otherwise>${nDto.status}</c:otherwise>
									</c:choose>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>

			<c:if test="${sessionScope.loginId == 'admin'}">
				<div class="mt-20 text-center">
					<a href="noticeAdd.too" class="btn btn-primary">공지사항 작성</a>
				</div>
			</c:if>

			<form action="noticeSearch.too" method="post" class="search-form">
				<select name="search_col" class="search-select">
					<option value="search_title">제목</option>
					<option value="search_content">내용</option>
					<option value="search_writer">작성자</option>
				</select>
				<input type="text" 
					   name="search_value" 
					   class="search-input" 
					   placeholder="검색어를 입력하세요">
				<button type="submit" class="btn btn-primary">검색</button>
			</form>

			<!-- 페이징 -->
			<div class="pagination">
				<c:forEach var="i" begin="1" end="${totalPage}">
					<c:choose>
						<c:when test="${i == currentPage}">
							<span class="page-number current">${i}</span>
						</c:when>
						<c:otherwise>
							<a href="noticeListPage.too?page=${i}" class="page-number">${i}</a>
						</c:otherwise>
					</c:choose>
				</c:forEach>
			</div>
		</section>
	</main>
</body>
</html>