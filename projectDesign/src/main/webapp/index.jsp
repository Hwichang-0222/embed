<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>메인 페이지</title>
<link rel="stylesheet" href="css/common.css">
</head>
<body>
	<header class="header">
		<div class="container">
			<h1>환영합니다</h1>
			<div class="welcome-message">
				<c:choose>
					<c:when test="${not empty sessionScope.loginId}">
						${sessionScope.loginId}님 환영합니다.
					</c:when>
					<c:otherwise>
						로그인이 필요합니다.
					</c:otherwise>
				</c:choose>
			</div>
			<nav class="nav-links">
				<c:choose>
					<c:when test="${not empty sessionScope.loginId}">
						<a href="mUpdateUI.do?id=${sessionScope.loginId}" class="nav-link">개인정보 수정</a>
						<a href="logOut.ddo" class="nav-link">로그아웃</a>
						<c:if test="${sessionScope.loginId == 'admin'}">
							<a href="memberList.do" class="nav-link">회원 목록</a>
						</c:if>
					</c:when>
					<c:otherwise>
						<a href="loginUI.ddo" class="nav-link">로그인</a>
						<a href="mWriteUI.do" class="nav-link">회원가입</a>
					</c:otherwise>
				</c:choose>
				<a href="noticeListPage.too" class="nav-link">공지사항 목록보기</a>
				<a href="productList.doo" class="nav-link">제품 목록보기</a>
			</nav>
		</div>
	</header>
	
	<main class="container">
		<section class="card">
			<h2 class="card-title">공지사항</h2>
			<div class="iframe-container">
				<iframe src="noticeList.too" id="noticeIframe" scrolling="no"></iframe>
			</div>
		</section>
		
		<section class="card">
			<h2 class="card-title">제품 목록</h2>
			<div class="iframe-container">
				<iframe src="productList.doo" id="productIframe" scrolling="no"></iframe>
			</div>
		</section>
	</main>
	
	<script>
		// iframe 높이 자동 조절
		window.addEventListener('load', function() {
			function resizeIframe(iframe) {
				try {
					if (iframe.contentWindow.document.body) {
						iframe.style.height = iframe.contentWindow.document.body.scrollHeight + 50 + 'px';
					}
				} catch (e) {
					iframe.style.height = '800px';
				}
			}
	
			const noticeIframe = document.getElementById('noticeIframe');
			const productIframe = document.getElementById('productIframe');
	
			noticeIframe.onload = function() { resizeIframe(noticeIframe); };
			productIframe.onload = function() { resizeIframe(productIframe); };
	
			// 초기 로드 및 재시도
			setTimeout(function() {
				resizeIframe(noticeIframe);
				resizeIframe(productIframe);
			}, 500);
	
			setTimeout(function() {
				resizeIframe(noticeIframe);
				resizeIframe(productIframe);
			}, 1000);
		});
	</script>
</body>
</html>