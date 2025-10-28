<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
	String sessionId = (String) session.getAttribute("sessionId");
%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Menu</title>
</head>
<body>
	<header class="pb-3 mb-4 border-bottom">
		<div class="container">
			<div class="d-flex flex-wrap align-item-cemter justify-content-center justify-content-lg-start">
				<a href='<c:url value="/bookmarket/welcome.do"/>' class="d-flex align-items-center mb-3 mb-md-0 me-md-auto text-dark text-decoration-none">
					<svg width="32" height="32" fill="currentColor" class="bi bi-house-fill" viewBox="0 0 16 16">
						<path d="M8.707 1.5a1 1 0 0 0-1.414 0L.646 8.146a.5.5 0 0 0 .708.708L8 2.207l6.646 6.647a.5.5 0 0 0 .708-.708L13 5.793V2.5a.5.5 0 0 0-.5-.5h-1a.5.5 0 0 0-.5.5v1.293L8.707 1.5Z"/>
						<path d="m8 3.293 6 6V13.5a1.5 1.5 0 0 1-1.5 1.5h-9A1.5 1.5 0 0 1 2 13.5V9.293l6-6Z"/>
					</svg>   
					<span class="fs-4">Home</span>	
				</a>
			
				<ul class="nav nav-pills">
					<c:choose>
						<c:when test="${empty sessionId}">
							<!-- 로그인 안 됨 -->
							<li class="nav-item"><a class="nav-link" href='<c:url value="/bookmarket/member/loginMember.do"/>'>로그인</a></li>
							<li class="nav-item"><a class="nav-link" href='<c:url value="/bookmarket/member/addMember.do"/>'>회원가입</a></li>
						</c:when>
						
						<c:otherwise>
							<!-- 로그인 됨 -->
							<li class="nav-item"><span class="nav-link">[<%=sessionId%> 님]</span></li>
							<li class="nav-item"><a class="nav-link" href='<c:url value="/bookmarket/member/logoutMember.do"/>'>로그아웃</a></li>
							<li class="nav-item"><a class="nav-link" href='<c:url value="/bookmarket/member/updateMember.do"/>'>회원수정</a></li>
							
						</c:otherwise>
					</c:choose>
					
					<!-- 도서 목록 (모든 사용자) -->
					<li class="nav-item"><a href='<c:url value="/bookmarket/books.do"/>' class="nav-link">도서 목록</a></li>
					<li class="nav-item"><a class="nav-link" href='<c:url value="/bookmarket/cart.do"/>'>장바구니</a></li>
					
					<!-- 관리자 전용 메뉴 -->
					<c:if test="${sessionId == 'admin'}">
						<li class="nav-item"><a href='<c:url value="/bookmarket/addBook.do"/>' class="nav-link">도서 등록</a></li>
						<li class="nav-item"><a href='<c:url value="/bookmarket/editBook.do?edit=update"/>' class="nav-link">도서 수정</a></li>
						<li class="nav-item"><a href='<c:url value="/bookmarket/editBook.do?edit=delete"/>' class="nav-link">도서 삭제</a></li>
					</c:if>
					
					<!-- 게시판 (모든 사용자) -->
					<li class="nav-item"><a href='<c:url value="/bookmarket/bbs/list.do"/>' class="nav-link">게시판</a></li>
				</ul>
			
			</div>
		</div>
	</header>
</body>
</html>