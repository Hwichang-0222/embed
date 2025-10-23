<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>학생 정보 변경</title>
</head>
<body>
    <h2>학생 정보 변경 </h2>
    <form action="update_process.jsp" method="post">
        변경전 학과:  <input type="text" name="depart_before"><br>
        변경후 학과: <input type="text" name="depart_after"><br>
        <input type="submit" value="전송">
    </form>
</body>
</html>