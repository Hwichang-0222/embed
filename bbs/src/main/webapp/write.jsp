<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>Write Board</title>
	<link rel="stylesheet" href="css/write.css">
</head>
<body>
	<div id="container">
	
		<h1>Board Write View</h1>
	
		<form action="write.do" method="post" class="write-form">
			<label for="title">Title</label>
			<input type="text" name="title" id="title">
	
			<label for="author">Author</label>
			<input type="text" name="author" id="author">
	
			<label for="content">Content</label>
			<textarea name="content" id="content" rows="5" cols="20"></textarea>
	
			<input type="submit" value="저장">
		</form>
	
		<div class="button-wrap">
			<button type="button" onclick="location.href='list.do'">Go List</button>
		</div>
	
	</div>
</body>
</html>