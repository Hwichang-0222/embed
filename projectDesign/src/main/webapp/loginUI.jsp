<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>로그인</title>
<link rel="stylesheet" href="css/common.css">
</head>
<body>
	<header class="header">
		<div class="container">
			<h1>회원 로그인</h1>
			<nav class="nav-links">
				<a href="index.ddo" class="nav-link">메인화면</a>
				<a href="mWriteUI.do" class="nav-link">회원가입</a>
			</nav>
		</div>
	</header>
	
	<main class="container">
		<div class="form-container">
			<h3 class="text-center mb-20">로그인 하세요</h3>
			<form action="login.ddo" method="post">
				<fieldset class="form-fieldset">
					<ul class="form-list">
						<li class="form-item">
							<label class="form-label" for="userId">아이디</label>
							<input type="text" 
								   class="form-input" 
								   id="userId" 
								   name="id" 
								   placeholder="아이디를 입력하세요" 
								   required 
								   autofocus>
						</li>
						<li class="form-item">
							<label class="form-label" for="userPassword">패스워드</label>
							<input type="password" 
								   class="form-input" 
								   id="userPassword" 
								   name="password" 
								   placeholder="패스워드를 입력하세요" 
								   required>
						</li>
						<li class="form-item text-center">
							<button type="submit" class="btn btn-primary">로그인</button>
						</li>
					</ul>
				</fieldset>
			</form>
		</div>
	</main>
	
	<c:if test="${not empty loginFailMsg}">
		<script>
			alert("${loginFailMsg}");
		</script>
	</c:if>
</body>
</html>