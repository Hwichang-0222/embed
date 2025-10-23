<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>도서 목록</title>
    <link rel="stylesheet" href="/css/bootstrap.min.css" />
</head>
<body>
<div class="container py-4">

    <jsp:include page="/bookmarket/menu.do" />

    <div class="p-5 mb-4 bg-body-tertiary rounded-3">
        <div class="container-fluid py-5">
            <h1 class="display-5 fw-bold">도서 목록</h1>
            <p class="col-md-8 fs-4">Book List</p>
        </div>
    </div>

    <!-- 도서 카드 리스트 -->
    <div class="row align-items-md-stretch text-center">
        <c:forEach var="book" items="${books}">
            <div class="col-md-4 mb-4">
                <div class="card h-100 shadow-sm p-3">
                    <!-- 도서 이미지 -->
                    <img src="/images/${book.filename}" class="card-img-top"
                         style="height: 350px; object-fit: cover;" alt="Book Image">

                    <!-- 도서 정보 -->
                    <div class="card-body">
                        <h5 class="card-title fw-bold">${book.name}</h5>
                        <p class="card-text text-muted">
                            ${book.author}<br>
                            ${book.publisher} | ${book.releaseDate}
                        </p>

                        <!-- 도서 설명 (60자 제한) -->
                        <p class="small text-start">
                            <c:choose>
                                <c:when test="${not empty book.description and fn:length(book.description) > 60}">
                                    ${fn:substring(book.description, 0, 60)}...
                                </c:when>
                                <c:otherwise>
                                    ${book.description}
                                </c:otherwise>
                            </c:choose>
                        </p>

                        <p class="fw-semibold text-primary">${book.unitPrice}원</p>

                        <!-- 버튼 영역 -->
                        <div class="d-flex justify-content-between">
                            <form name="addForm" action="/bookmarket/addCart.do?id=${book.bookId}" method="post">
                                <button type="submit" class="btn btn-info btn-sm">도서주문 &raquo;</button>
                            </form>
                            <a href="/bookmarket/book.do?id=${book.bookId}" class="btn btn-warning btn-sm">상세보기</a>
                        </div>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>

    <jsp:include page="/bookmarket/footer.do" />

</div>
</body>
</html>
