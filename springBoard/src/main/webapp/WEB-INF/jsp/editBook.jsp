<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>도서 편집</title>
    <link rel="stylesheet" href="/css/bootstrap.min.css" />
    <script type="text/javascript">
        function deleteConfirm(id) {
            if (confirm("해당 도서를 삭제하시겠습니까?")) {
                location.href = "/bookmarket/deleteBook.do?id=" + encodeURIComponent(id);
            }
        }
    </script>
</head>
<body>
<div class="container py-4">

    <jsp:include page="/bookmarket/menu.do" />

    <div class="p-5 mb-4 bg-body-tertiary rounded-3">
        <div class="container-fluid py-5">
            <h1 class="display-5 fw-bold">도서 편집</h1>
            <p class="col-md-8 fs-4">Book Editing</p>
        </div>
    </div>



    <div class="row align-items-md-stretch text-center">
        <c:forEach var="book" items="${books}">
            <div class="col-md-4 mb-4">
                <div class="card h-100 shadow-sm p-3">
                    <img src="/images/${book.filename}" class="card-img-top" style="height: 350px; object-fit: cover;" alt="Book Image">
                    <div class="card-body">
                        <h5 class="card-title fw-bold">${book.name}</h5>
                        <p class="card-text text-muted">
                            ${book.author}<br>
                            ${book.publisher} | ${book.releaseDate}
                        </p>
                        <p class="small text-start">
                            <c:choose>
                                <c:when test="${fn:length(book.description) > 60}">
                                    ${fn:substring(book.description, 0, 60)}...
                                </c:when>
                                <c:otherwise>
                                    ${book.description}
                                </c:otherwise>
                            </c:choose>
                        </p>
                        <p class="fw-semibold text-primary">${book.unitPrice}원</p>

                        <c:choose>
                            <c:when test="${edit eq 'update'}">
                                <a href="/bookmarket/updateBook.do?id=${book.bookId}" class="btn btn-success">수정 &raquo;</a>
                            </c:when>
                            <c:when test="${edit eq 'delete'}">
                                <button type="button" class="btn btn-danger" onclick="deleteConfirm('${book.bookId}')">삭제 &raquo;</button>
                            </c:when>
                        </c:choose>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>

    <jsp:include page="/bookmarket/footer.do" />

</div>
</body>
</html>
