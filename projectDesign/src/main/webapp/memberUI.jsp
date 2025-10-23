<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>회원가입</title>
<link rel="stylesheet" href="css/common.css">
</head>
<body>
	<header class="header">
		<div class="container">
			<h1>회원가입</h1>
			<nav class="nav-links">
				<a href="index.ddo" class="nav-link">메인화면</a>
				<a href="loginUI.ddo" class="nav-link">로그인</a>
			</nav>
		</div>
	</header>
	
	<main class="container">
		<div class="form-container">
			<form action="mMember.do" method="post">
				<fieldset class="form-fieldset">
					<legend class="form-legend">회원 입력 폼</legend>
					<ul class="form-list">
						<li class="form-item">
							<label class="form-label" for="memberId">아이디</label>
							<input type="text" class="form-input" id="memberId" name="id" required>
						</li>
						<li class="form-item">
							<label class="form-label" for="memberPassword">패스워드</label>
							<input type="password" class="form-input" id="memberPassword" name="password" required>
						</li>
						<li class="form-item">
							<label class="form-label" for="memberName">이름</label>
							<input type="text" class="form-input" id="memberName" name="name" required>
						</li>
						<li class="form-item">
							<label class="form-label">성별</label>
							<div class="radio-group">
								<label>
									<input name="gender" type="radio" value="남" required> 남
								</label>
								<label>
									<input name="gender" type="radio" value="여" required> 여
								</label>
							</div>
						</li>
						<li class="form-item">
							<label class="form-label" for="memberBirth">생일</label>
							<input type="text" class="form-input" id="memberBirth" name="birth" placeholder="YYYY-MM-DD" required>
						</li>
						<li class="form-item">
							<label class="form-label" for="memberMail">이메일</label>
							<input type="email" class="form-input" id="memberMail" name="mail" required>
						</li>
						<li class="form-item">
							<label class="form-label" for="memberPhone">연락처</label>
							<input type="tel" class="form-input" id="memberPhone" name="phone" placeholder="010-0000-0000" required>
						</li>
						<li class="form-item">
							<label class="form-label" for="memberAddress">주소</label>
							<input type="text" class="form-input" id="memberAddress" name="address" required>
						</li>
						<li class="form-item">
							<label class="form-label" for="memberRegistDay">가입일</label>
							<input type="text" class="form-input" id="memberRegistDay" name="regist_day" placeholder="YYYY-MM-DD" required>
						</li>
						<li class="form-item text-center">
							<button type="submit" class="btn btn-primary">가입하기</button>
						</li>
					</ul>
				</fieldset>
			</form>
		</div>
	</main>
</body>
</html>