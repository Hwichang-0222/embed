<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>제품 목록</title>
<link rel="stylesheet" href="css/common.css">
</head>
<body>
	<header class="header">
		<div class="container">
			<h1>제품 목록</h1>
			<nav class="nav-links">
				<c:if test="${sessionScope.loginId == 'admin'}">
					<a href="productAdd.doo" class="nav-link">제품 추가</a>
				</c:if>
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
							<th>제품 번호</th>
							<th>제품 이름</th>
							<th>제품 가격</th>
							<th>재고 수량</th>
							<c:if test="${sessionScope.loginId == 'admin'}">
								<th>수정</th>
								<th>삭제</th>
							</c:if>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="pDto" items="${productList}">
							<tr>
								<td>${pDto.num}</td>
								<td>${pDto.name}</td>
								<td>${pDto.price}원</td>
								<td>${pDto.amount}개</td>
								<c:if test="${sessionScope.loginId == 'admin'}">
									<td>
										<a href="productUpdateRetrieve.doo?num=${pDto.num}" class="action-link">수정</a>
									</td>
									<td>
										<a href="productDelete.doo?num=${pDto.num}" class="action-link action-link-danger" onclick="return confirm('정말 삭제하시겠습니까?');">삭제</a>
									</td>
								</c:if>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
			
			<form action="productSearchUI.doo" method="post" class="search-form">
				<select name="search_col" class="search-select">
					<option value="search_num">제품번호</option>
					<option value="search_name">제품명</option>
				</select>
				<input type="text" 
					   name="search_value" 
					   class="search-input" 
					   placeholder="검색어를 입력하세요">
				<button type="submit" class="btn btn-primary">검색</button>
			</form>
		</section>
	</main>
</body>
</html>