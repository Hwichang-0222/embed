<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>글쓰기</title>
  <link rel="stylesheet" href="/css/bootstrap.min.css" />
</head>
<body>
<div class="container py-4">

  <jsp:include page="/bookmarket/menu.do" />

  <c:set var="sessionId" value="${sessionScope.sessionId}" />

  <!-- 로그인 안 했을 경우 접근 차단 -->
  <c:if test="${empty sessionId}">
    <script>
      alert("로그인 후 이용 가능합니다.");
      location.href="/bookmarket/member/loginMember.do";
    </script>
  </c:if>

  <div class="p-5 mb-4 bg-body-tertiary rounded-3">
    <div class="container-fluid py-5">
      <h1 class="display-5 fw-bold">글쓰기</h1>
      <p class="col-md-8 fs-4">Write a new post</p>
    </div>
  </div>

  <form action="/bookmarket/bbs/write.do" method="post">
    <input type="hidden" name="id" value="${sessionId}" />

    <div class="mb-3">
      <label class="form-label">작성자 이름</label>
      <input type="text" class="form-control" name="name" required>
    </div>

    <div class="mb-3">
      <label class="form-label">제목</label>
      <input type="text" class="form-control" name="subject" required>
    </div>

    <div class="mb-3">
      <label class="form-label">내용</label>
      <textarea class="form-control" name="content" rows="10" required></textarea>
    </div>

    <div class="text-end">
      <a href="/bookmarket/bbs/list.do" class="btn btn-secondary">목록</a>
      <button type="submit" class="btn btn-primary">등록</button>
    </div>
  </form>

  <jsp:include page="/bookmarket/footer.do" />
</div>
</body>
</html>
