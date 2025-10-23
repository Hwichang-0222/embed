<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>게시판 목록</title>
    <link rel="stylesheet" href="/css/bootstrap.min.css" />
</head>
<body>
    <div class="container py-4">

        <jsp:include page="/bookmarket/menu.do" />

        <div class="p-5 mb-4 bg-body-tertiary rounded-3">
            <div class="container-fluid py-5">
                <h1 class="display-5 fw-bold">게시판</h1>
                <p class="col-md-8 fs-4">Board List</p>
            </div>
        </div>

        <!-- ✅ 로그인 세션 확인 -->
        <c:set var="sessionId" value="${sessionScope.sessionId}" />

        <!-- ✅ 상단 정보 영역 -->
        <div class="d-flex justify-content-between align-items-center mb-3">
            <div>
                <strong>총 게시글 수:</strong>
                <span class="text-primary">${totalCount}</span> 개
            </div>

            <div>
                <c:if test="${not empty sessionId}">
                    <a href="/bookmarket/bbs/writeForm.do" class="btn btn-primary">글쓰기</a>
                </c:if>
                <c:if test="${empty sessionId}">
                    <button class="btn btn-secondary" disabled>로그인 후 글쓰기 가능</button>
                </c:if>
            </div>
        </div>

        <!-- ✅ 게시글 목록 -->
        <table class="table table-hover align-middle">
            <thead class="table-light text-center">
                <tr>
                    <th width="8%">번호</th>
                    <th>제목</th>
                    <th width="15%">작성자</th>
                    <th width="20%">작성일</th>
                    <th width="10%">조회수</th>
                </tr>
            </thead>
            <tbody>
                <c:choose>
                    <c:when test="${empty posts}">
                        <tr>
                            <td colspan="5" class="text-center text-muted py-4">
                                등록된 게시글이 없습니다.
                            </td>
                        </tr>
                    </c:when>
                    <c:otherwise>
                        <c:forEach var="post" items="${posts}">
                            <tr>
                                <td class="text-center">${post.num}</td>
                                <td>
                                    <a href="/bookmarket/bbs/view.do?num=${post.num}" class="text-decoration-none">
                                        ${post.subject}
                                    </a>
                                </td>
                                <td class="text-center">${post.name}</td>
                                <td class="text-center">${post.registDay}</td>
                                <td class="text-center">${post.hit}</td>
                            </tr>
                        </c:forEach>
                    </c:otherwise>
                </c:choose>
            </tbody>
        </table>

        <!-- ✅ 페이지네이션 -->
        <c:if test="${totalPages > 1}">
            <div class="d-flex justify-content-center mt-4">
                <ul class="pagination">
                    <!-- 이전 버튼 -->
                    <c:if test="${currentPage > 1}">
                        <li class="page-item">
                            <a class="page-link" href="/bookmarket/bbs/list.do?page=${currentPage - 1}">이전</a>
                        </li>
                    </c:if>

                    <!-- 페이지 번호 -->
                    <c:forEach begin="1" end="${totalPages}" var="i">
                        <li class="page-item ${i == currentPage ? 'active' : ''}">
                            <a class="page-link" href="/bookmarket/bbs/list.do?page=${i}">${i}</a>
                        </li>
                    </c:forEach>

                    <!-- 다음 버튼 -->
                    <c:if test="${currentPage < totalPages}">
                        <li class="page-item">
                            <a class="page-link" href="/bookmarket/bbs/list.do?page=${currentPage + 1}">다음</a>
                        </li>
                    </c:if>
                </ul>
            </div>
        </c:if>

        <jsp:include page="/bookmarket/footer.do" />
    </div>
</body>
</html>
