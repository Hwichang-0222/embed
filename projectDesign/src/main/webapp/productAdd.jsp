<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>제품 추가</title>
<link rel="stylesheet" href="css/common.css">
</head>
<body>
	<header class="header">
		<div class="container">
			<h1>제품 추가</h1>
			<nav class="nav-links">
				<a href="productList.doo" class="nav-link">제품 목록</a>
				<a href="index.ddo" class="nav-link">메인화면</a>
			</nav>
		</div>
	</header>
	
	<main class="container">
		<div class="form-container">
			<form action="productAddUI.doo" method="post">
				<fieldset class="form-fieldset">
					<legend class="form-legend">제품 추가</legend>
					<ul class="form-list">
						<li class="form-item">
							<label class="form-label" for="productName">제품 이름</label>
							<input type="text" 
								   class="form-input" 
								   id="productName" 
								   name="name" 
								   placeholder="제품 이름을 입력하세요" 
								   required>
						</li>
						<li class="form-item">
							<label class="form-label" for="productPrice">제품 가격</label>
							<input type="number" 
								   class="form-input" 
								   id="productPrice" 
								   name="price" 
								   placeholder="가격을 입력하세요" 
								   min="0" 
								   required>
						</li>
						<li class="form-item">
							<label class="form-label" for="productAmount">재고 수량</label>
							<input type="number" 
								   class="form-input" 
								   id="productAmount" 
								   name="amount" 
								   placeholder="재고 수량을 입력하세요" 
								   min="0" 
								   required>
						</li>
						<li class="form-item text-center">
							<button type="submit" class="btn btn-primary">추가하기</button>
							<a href="productList.doo" class="btn btn-secondary">취소</a>
						</li>
					</ul>
				</fieldset>
			</form>
		</div>
	</main>
</body>
</html>