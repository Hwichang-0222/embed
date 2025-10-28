<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="/css/bootstrap.min.css" />
	<title>도서 상세 정보</title>
</head>
<body>
	<div class="container py-4">
		<jsp:include page="/bookmarket/menu.do" />
		
		<div class="p-5 mb-4 bg-body-tertiary rounded-3">
			<div class="container-fluid py-5">
				<h1 class="display-5 fw-bold">도서 정보</h1>
				<p class="col-md-8 fs-4">BookInfo</p>
			</div>
		</div>
		
		<c:if test="${not empty book}">
			<div class="row align-items-md-stretch">
				<div class="col-md-5">
					<img src="/images/${book.filename}" style="width: 100%">
				</div>
				<div class="col-md-6">
					<h3><b>${book.name}</b></h3>
					<p>${book.description}</p>
					<br>
					<p><b>도서코드 : </b><span class="badge text-bg-danger">${book.bookId}</span></p>
					<p><b>저자</b> : ${book.author}</p>
					<p><b>출판사</b> : ${book.publisher}</p>
					<p><b>출판일</b> : ${book.releaseDate}</p>
					<p><b>분류</b> : ${book.category}</p>
					<p><b>재고수</b> : ${book.unitsInStock}</p>
					<h4>${book.unitPrice}원</h4>
					<p>
						<form action="/bookmarket/addCart.do" method="post" class="d-inline">
							<input type="hidden" name="id" value="${book.bookId}">
							<label>수량:</label>
							<input type="number" name="quantity" value="1" min="1" style="width:80px;display:inline-block;" class="form-control d-inline">
							<button type="submit" class="btn btn-info">도서주문 &raquo;</button>
						</form>

						<a href="/bookmarket/cart.do" class="btn btn-warning">장바구니 &raquo;</a>
						<a href="/bookmarket/books.do" class="btn btn-secondary">도서목록 &raquo;</a>
					</p>
				</div>
			</div>
		</c:if>
		
		<c:if test="${empty book}">
			<div class="row align-items-md-stretch">
				<div class="col-md-12">
					<h2 class="alert alert-danger">해당 도서를 찾을 수 없습니다.</h2>
					<a href="/bookmarket/books.do" class="btn btn-secondary">도서 목록으로</a>
				</div>
			</div>
		</c:if>
		
		<jsp:include page="/bookmarket/footer.do" />
	</div>
</body>
</html>

<script type="text/javascript">
	function addToCart() {
		if (confirm("도서를 장바구니에 추가하시겠습니까?")) {
			document.addForm.submit();
		} else {
			document.addForm.reset();
		}
	}
</script>