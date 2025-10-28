<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>회원정보입력 1</title>
	<link rel="stylesheet" href="css/membercss.css">
</head>
<body>
	<h2>회원정보입력 화면</h2>
	<form action="memberAdd.do" method="post">
		<fieldset>
			<legend>회원정보입력</legend>
			<ul>
				<li>
					<label for="id">아이디</label>
					<input type="text" id="id" name="id" autofocus required>
					<input type="button" id="idChk" name="idChk" value="중복검사">
					<input type="hidden" name="idchk" id="idchk" value="N">
				</li>
				<li>
					<label for="pwd1">패스워드</label>
					<input type="password" id="pwd1" name="password1" required> 
				</li>
				<li>
					<label for="pwd2">패스워드 확인</label>
					<input type="password" id="pwd2" name="password2" required>
					<div id="pwCheckMsg" style="float: right; font-size:10px; margin-top:5px; font-weight:bold;"></div>
				</li>
				<li>
					<label for="name"> 이름 </label>
					<input type="text" id="name" name="name">
				</li>
				<li>
					<label for="tel"> 휴대폰 번호 </label>
					<input type="tel" id="tel" name="tel">
				</li>
				<li>
					<label for="email">이메일</label>
					<input type="email" id="email" name="email" required> 
				</li>    
				<li>
					<label for="birth" id="birth">생일</label>
					<input type="date" id="birth" name="birthday">
				</li>
				<li>
					<label for="homepage"> 홈페이지 </label>
					<input type="text" id="homepage" name="homepage">
				</li>
				<li>
					<input type="radio" name="gender" value="M">
					<label for="genderMale" id="genderMale">남성</label>
				</li>
				<li>
					<input type="radio" name="gender" value="F">
					<label for="genderFemale" id="genderFemale">여성</label>
				</li>
			</ul>
		</fieldset>
		<div>
			<input type="submit" value="제출">
			<input type="reset" value="초기화">
			<button onclick="location.href='memberLoginui.do'">취소</button>
		</div>
	</form>
	<script src="js/memberIdCheck.js"></script>
</body>
</html>