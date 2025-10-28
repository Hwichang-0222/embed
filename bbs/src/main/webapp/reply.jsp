<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Reply</title>
	<link rel="stylesheet" href="css/reply.css">
</head>
<body>
	<div id="container">
	
		<h1>Reply Page</h1>
	
		<form action="reply.do" method="post" class="reply-form">
			<input type="hidden" name="num" value="${replyui.num}">
			<input type="hidden" name="repRoot" value="${replyui.repRoot}">
			<input type="hidden" name="repStep" value="${replyui.repStep}">
			<input type="hidden" name="repIndent" value="${replyui.repIndent}">
	
			<div class="meta-info">
				<span>No. : ${replyui.num}</span>
				<span>View : ${replyui.readCnt}</span>
			</div>
	
			<label for="title">Title</label>
			<input type="text" name="title" id="title" value="${replyui.title}">
	
			<label for="author">Author</label>
			<input type="text" name="author" id="author" value="${replyui.author}">
	
			<label for="content">Content</label>
			<textarea name="content" id="content" rows="5" cols="20">${replyui.content}</textarea>
	
			<input type="submit" value="Reply">
		</form>
	
		<div class="button-group">
			<button type="button" onclick="location.href='list.do'">List</button>
		</div>
	</div>
</body>
</html>