<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>유효성 검사</title>
   <script type="text/javascript">
      function checkLogin() {
         let form = document.loginForm;
         if (form.id.value=="") {
            alert("아이디를 입력해주세요");
            form.id.focus();
            
         }else if (form.passwd.value == ""){
            alert("패스워드를 입력해주세요");
            form.passwd.focus();

            }else{
               form.submit();
            }
         
         
            
      }
   </script>
</head>
<body>
   <form action="validation_process.jsp" method="post" name="loginForm">
      아이디 : <input type="text" name="id"><br>
      비밀번호 : <input type="password" name="passwd"><br>
      <input type="button" value="전송" onclick="checkLogin()"><br>
   </form>

</body>
</html>