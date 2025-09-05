<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>Board List View</title>
	<link rel="stylesheet" href="css/list.css">
</head>
<body>
	<div id="container">
	
		<h1>Board List View</h1>
	
		<!-- 검색 영역 -->
		<form action="search.do" class="search-form">
			<label for="searchName" class="sr-only">검색 조건</label>
			<select name="searchName" id="searchName">
				<option value="author">Author</option>
				<option value="title">Title</option>
			</select>
	
			<label for="searchValue" class="sr-only">검색어</label>
			<input type="text" name="searchValue" id="searchValue" placeholder="검색어 입력">
	
			<input type="submit" value="Find">
		</form>
	
		<!-- 리스트 테이블 -->
		<table class="board-table">
			<thead>
				<tr>
					<th>No.</th>
					<th>Title</th>
					<th>Author</th>
					<th>Date</th>
					<th>View</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="dto">
					<tr>
						<td>${dto.num}</td>
						<td>
							<c:forEach begin="1" end="${dto.repIndent}">
								<%="&nbsp;&nbsp;"%>
							</c:forEach>
							<a href="retrieve.do?num=${dto.num}">${dto.title}</a>
						</td>
						<td>${dto.author}</td>
						<td>${dto.writeday}</td>
						<td>${dto.readCnt}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	
	    <!-- 글쓰기 버튼 -->
		<div class="button-wrap">
			<button type="button" onclick="location.href='list.do'">List</button>
			<button type="button" onclick="location.href='writeui.do'">Write</button>
		</div>
	
	</div>
</body>
</html>