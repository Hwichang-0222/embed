<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일 업로드</title>
</head>
<body>
	<form action="fileUpload01_process.jsp" enctype="multipart/form-data" method="post">
		이름 : <input type="text" name="name"><br>
		제목 : <input type="text" name="subject"><br>
		파일 : <input type="file" name="filename"><br>
		<input type = "submit" value="파일 올리기">
	</form>
</body>
</html>