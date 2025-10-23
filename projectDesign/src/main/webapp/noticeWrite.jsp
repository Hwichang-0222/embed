<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>공지사항 작성</title>
<link rel="stylesheet" href="css/common.css">
</head>
<body>
	<header class="header">
		<div class="container">
			<h1>공지사항 작성</h1>
			<nav class="nav-links">
				<a href="noticeList.too" class="nav-link">공지사항 목록</a>
				<a href="index.ddo" class="nav-link">메인화면</a>
			</nav>
		</div>
	</header>

	<main class="container">
		<div class="form-container">
			<form action="noticeWriteUI.too" method="post">
				<fieldset class="form-fieldset">
					<legend class="form-legend">공지사항 작성</legend>
					
					<ul class="form-list">
						<li class="form-item">
							<label class="form-label" for="noticeTitle">제목</label>
							<input type="text" 
								   class="form-input" 
								   id="noticeTitle" 
								   name="title" 
								   placeholder="제목을 입력하세요" 
								   required>
						</li>
						<li class="form-item">
							<label class="form-label" for="noticeWriter">작성자</label>
							<input type="text" 
								   class="form-input" 
								   id="noticeWriter" 
								   name="writer" 
								   value="${sessionScope.loginId}" 
								   readonly>
						</li>
						<li class="form-item">
							<label class="form-label" for="noticeStatus">상태</label>
							<select class="form-input" id="noticeStatus" name="status" required>
								<option value="new" selected>새글</option>
								<option value="modified">수정글</option>
							</select>
						</li>
						<li class="form-item">
							<label class="form-label" for="noticeContent">내용</label>
							<textarea class="form-input" 
									  id="noticeContent" 
									  name="content" 
									  rows="10" 
									  placeholder="내용을 입력하세요" 
									  required></textarea>
						</li>
						<li class="form-item text-center">
							<button type="submit" class="btn btn-primary">작성하기</button>
							<a href="noticeList.too" class="btn btn-secondary">취소</a>
						</li>
					</ul>
				</fieldset>
			</form>
		</div>
	</main>
</body>
</html>