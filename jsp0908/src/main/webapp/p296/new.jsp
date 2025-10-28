<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 유효성 검사</title>
   <script type="text/javascript">
      function checkMember() {
         
         let regExpId = /^[a-z|A-Z|ㄱ-ㅎ|ㅏ-ㅣ|가-힣]/;
         let regExpName = /^[가-힣]+$/;
         let regPasswd = /^[0-9]+$/;
         let regExpPhone = /^\d{3}-\d{3,4}-\d{4}$/;
         let regExpEmail = /^[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$/i;
         
         let form = document.member;
         
         let id = form.id.value;
         let name = form.name.value;
         let passwd = form.passwd.value;
         let phone = form.phone1.value + "-" + form.phone2.value + "-" + form.phone3.value;
         let email = form.email.value;
         
         if(!regExpId.test(id)){
            alert("아이디는 문자로 시작해주세요!");
            form.id.select();
            return;
         }
         
         if (!regPasswd.test(passwd) && passwd == "") {
            alert("비밀번호를 숫자로 입력해주세요!");
            form.passwd.focus();
            return;
         }
         
         if(!regExpName.test(name) && name == ""){
            alert("이름은 한글로 입력해주세요!");
            form.name.focus();
            return;
         }
         
         if(!regExpPhone.test(phone) ){
            alert("연락처 입력을 확인해주세요!");
            form.phone1.select();
            return;
         }
         
         if(!regExpEmail.test(email)){
            alert("이메일을 확인해주세요!");
            form.email.select();
            return;
         }
         
         form.submit();
         
         
      }
   </script>
</head>
<body>
   <h3>회원 가입</h3>
   <form action="validationMember_process.jsp" name="member" method="post">
      아이디 : <input type="text" name="id"><br>
      비밀번호 : <input type="password" name="passwd"><br>
      이름: <input type="text" name="name"><br>
      연락처 : 
         <select name="phone1">
            <option value="010">010</option>
            <option value="011">011</option>
         </select> - <input type="text" maxlength="4" size="4" name="phone2">
                 - <input type="text" maxlength="4" size="4" name="phone3"><br>
      이메일 : <input type="text" name="email"><br>
      <input type="button" value="가입하기" onclick="checkMember()"><br>
   </form>
</body>
</html>