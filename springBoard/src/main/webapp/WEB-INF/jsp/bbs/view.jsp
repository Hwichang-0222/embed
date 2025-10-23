<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>게시글 보기</title>
    <link rel="stylesheet" href="/css/bootstrap.min.css" />
    <script>
        function enableEditMode() {
            document.querySelectorAll('.editable').forEach(el => el.removeAttribute('readonly'));
            document.getElementById('editBtn').style.display = 'none';
            document.getElementById('submitBtn').style.display = 'inline-block';
            document.getElementById('cancelBtn').style.display = 'inline-block';
        }

        function cancelEditMode() {
            location.reload();
        }
    </script>
</head>
<body>
    <div class="container py-4">
        <jsp:include page="/bookmarket/menu.do" />

        <div class="p-5 mb-4 bg-body-tertiary rounded-3">
            <div class="container-fluid py-5">
                <h1 class="display-5 fw-bold">게시판</h1>
                <p class="col-md-8 fs-4">Board View</p>
            </div>
        </div>

        <c:set var="sessionId" value="${sessionScope.sessionId}" />
        <c:set var="userId" value="${post.id}" />

        <div class="row align-items-md-stretch text-center">
            <form name="updateForm" action="/bookmarket/bbs/edit.do" method="post">
                <input type="hidden" name="num" value="${post.num}" />
                <input type="hidden" name="id" value="${post.id}" />

                <div class="mb-3 row">
                    <label class="col-sm-2 control-label">성명</label>
                    <div class="col-sm-3">
                        <input name="name" class="form-control editable" value="${post.name}" readonly>
                    </div>
                </div>

                <div class="mb-3 row">
                    <label class="col-sm-2 control-label">제목</label>
                    <div class="col-sm-5">
                        <input name="subject" class="form-control editable" value="${post.subject}" readonly>
                    </div>
                </div>

                <div class="mb-3 row">
                    <label class="col-sm-2 control-label">내용</label>
                    <div class="col-sm-8" style="word-break: break-all;">
                        <textarea name="content" class="form-control editable" cols="50" rows="6" readonly>${post.content}</textarea>
                    </div>
                </div>

                <div class="mb-3 row">
                    <div class="col-sm-offset-2 col-sm-10">
                        <c:if test="${sessionId eq userId}">
                            <a href="/bookmarket/bbs/delete.do?num=${post.num}" class="btn btn-danger"
                               onclick="return confirm('정말 삭제하시겠습니까?');">삭제</a>

                            <button type="button" id="editBtn" class="btn btn-success" onclick="enableEditMode()">수정</button>
                            <button type="submit" id="submitBtn" class="btn btn-primary" style="display:none;">완료</button>
                            <button type="button" id="cancelBtn" class="btn btn-secondary" style="display:none;"
                                    onclick="cancelEditMode()">취소</button>
                        </c:if>

                        <a href="/bookmarket/bbs/list.do" class="btn btn-outline-dark">목록</a>
                    </div>
                </div>
            </form>
        </div>

        <jsp:include page="/bookmarket/footer.do" />
    </div>
</body>
</html>
