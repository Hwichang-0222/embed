<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>점수 입력</title>
</head>
<body>
	<h2>점수 입력 </h2>
    <form action="core_process.jsp" method="post">
        점수:  <input type="text" name="score"><br>
        <input type="submit" value="전송">
    </form>

</body>
</html>