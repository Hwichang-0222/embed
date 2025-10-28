<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>제품 정보 수정</title>
<link rel="stylesheet" href="css/common.css">
</head>
<body>
	<header class="header">
		<div class="container">
			<h1>제품 정보 수정</h1>
			<nav class="nav-links">
				<a href="productList.doo" class="nav-link">제품 목록</a>
				<a href="index.ddo" class="nav-link">메인화면</a>
			</nav>
		</div>
	</header>
	
	<main class="container">
		<div class="form-container">
			<form action="productUpdateUI.doo" method="post">
				<fieldset class="form-fieldset">
					<legend class="form-legend">제품 정보 수정</legend>
					<input type="hidden" name="num" value="${pData.num}">
					<input type="hidden" name="name" value="${pData.name}">
					
					<ul class="form-list">
						<li class="form-item">
							<label class="form-label" for="updateProductNum">제품 번호</label>
							<input type="text" 
								   class="form-input" 
								   id="updateProductNum" 
								   value="${pData.num}" 
								   disabled>
						</li>
						<li class="form-item">
							<label class="form-label" for="updateProductName">제품 이름</label>
							<input type="text" 
								   class="form-input" 
								   id="updateProductName" 
								   value="${pData.name}" 
								   disabled>
						</li>
						<li class="form-item">
							<label class="form-label" for="updateProductPrice">제품 가격</label>
							<input type="number" 
								   class="form-input" 
								   id="updateProductPrice" 
								   name="price" 
								   value="${pData.price}" 
								   min="0" 
								   required>
						</li>
						<li class="form-item">
							<label class="form-label" for="updateProductAmount">재고 수량</label>
							<input type="number" 
								   class="form-input" 
								   id="updateProductAmount" 
								   name="amount" 
								   value="${pData.amount}" 
								   min="0" 
								   required>
						</li>
						<li class="form-item text-center">
							<button type="submit" class="btn btn-primary">수정하기</button>
							<a href="productList.doo" class="btn btn-secondary">취소</a>
						</li>
					</ul>
				</fieldset>
			</form>
		</div>
	</main>
</body>
</html>