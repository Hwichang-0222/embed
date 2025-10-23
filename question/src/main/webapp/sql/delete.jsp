<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>학생 정보 삭제</title>
</head>
<body>
    <h2>학생 정보 변경 </h2>
    <form action="delete_process.jsp" method="post">
        삭제할 학과:  <input type="text" name="depart"><br>
        <input type="submit" value="전송">
    </form>
</body>
</html>