<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>회원정보 수정</title>
<link rel="stylesheet" href="css/common.css">
</head>
<body>
	<header class="header">
		<div class="container">
			<h1>회원정보 수정</h1>
			<nav class="nav-links">
				<a href="index.ddo" class="nav-link">메인화면</a>
				<c:if test="${sessionScope.loginId == 'admin'}">
					<a href="memberList.do" class="nav-link">회원 목록</a>
				</c:if>
			</nav>
		</div>
	</header>
	
	<main class="container">
		<div class="form-container">
			<form action="mUpdate.do" method="post">
				<fieldset class="form-fieldset">
					<legend class="form-legend">회원 수정 폼</legend>
					<input type="hidden" name="id" value="${mData.id}">
					
					<ul class="form-list">
						<li class="form-item">
							<label class="form-label" for="updateMemberId">아이디</label>
							<input type="text" 
								   class="form-input" 
								   id="updateMemberId" 
								   value="${mData.id}" 
								   disabled>
						</li>
						<li class="form-item">
							<label class="form-label" for="updateMemberPassword">패스워드</label>
							<input type="password" 
								   class="form-input" 
								   id="updateMemberPassword" 
								   name="password" 
								   value="${mData.password}" 
								   required>
						</li>
						<li class="form-item">
							<label class="form-label" for="updateMemberName">이름</label>
							<input type="text" 
								   class="form-input" 
								   id="updateMemberName" 
								   name="name" 
								   value="${mData.name}" 
								   required>
						</li>
						<li class="form-item">
							<label class="form-label">성별</label>
							<div class="radio-group">
								<label>
									<input name="gender" type="radio" value="남" ${mData.gender == '남' ? 'checked' : ''} required> 남
								</label>
								<label>
									<input name="gender" type="radio" value="여" ${mData.gender == '여' ? 'checked' : ''} required> 여
								</label>
							</div>
						</li>
						<li class="form-item">
							<label class="form-label" for="updateMemberBirth">생일</label>
							<input type="text" 
								   class="form-input" 
								   id="updateMemberBirth" 
								   value="${mData.birth}" 
								   disabled>
							<input type="hidden" name="birth" value="${mData.birth}">
						</li>
						<li class="form-item">
							<label class="form-label" for="updateMemberMail">이메일</label>
							<input type="email" 
								   class="form-input" 
								   id="updateMemberMail" 
								   name="mail" 
								   value="${mData.mail}" 
								   required>
						</li>
						<li class="form-item">
							<label class="form-label" for="updateMemberPhone">연락처</label>
							<input type="tel" 
								   class="form-input" 
								   id="updateMemberPhone" 
								   name="phone" 
								   value="${mData.phone}" 
								   required>
						</li>
						<li class="form-item">
							<label class="form-label" for="updateMemberAddress">주소</label>
							<input type="text" 
								   class="form-input" 
								   id="updateMemberAddress" 
								   name="address" 
								   value="${mData.address}" 
								   required>
						</li>
						<li class="form-item">
							<label class="form-label" for="updateMemberRegistDay">가입일</label>
							<input type="text" 
								   class="form-input" 
								   id="updateMemberRegistDay" 
								   value="${mData.regist_day}" 
								   disabled>
							<input type="hidden" name="regist_day" value="${mData.regist_day}">
						</li>
						<li class="form-item text-center">
							<button type="submit" class="btn btn-primary">수정하기</button>
						</li>
					</ul>
				</fieldset>
			</form>
		</div>
	</main>
</body>
</html>