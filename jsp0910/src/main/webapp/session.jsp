<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Session Login</title>
</head>
<body>
    <h2>로그인 페이지</h2>
    <form action="session_process.jsp" method="post">
        아이디: <input type="text" name="id" /><br><br>
        비밀번호: <input type="password" name="pw" /><br><br>
        <input type="submit" value="로그인" />
    </form>
</body>
</html>
