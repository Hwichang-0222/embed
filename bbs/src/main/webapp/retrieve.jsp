<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>Retrieve Page</title>
    <link rel="stylesheet" href="css/retrieve.css">
</head>
<body>
	<div id="container">
	
		<h1>Retrieve Page</h1>
	
		<form action="update.do" method="post" class="retrieve-form">
			<input type="hidden" name="num" value="${retrieve.num}">
	
			<div class="meta-info">
				<span>No. : ${retrieve.num}</span>
				<span>View : ${retrieve.readCnt}</span>
			</div>
	
			<label for="title">Title</label>
			<input type="text" name="title" id="title" value="${retrieve.title}">
	
			<label for="author">Author</label>
			<input type="text" name="author" id="author" value="${retrieve.author}">
	
			<label for="content">Content</label>
			<textarea name="content" id="content" rows="5" cols="20">${retrieve.content}</textarea>
	
			<input type="submit" value="Update">
		</form>
	
		<div class="button-group">
			<button type="button" onclick="location.href='list.do'">List</button>
			<button type="button" onclick="location.href='delete.do?num=${retrieve.num}'">Delete</button>
			<button type="button" onclick="location.href='replyui.do?num=${retrieve.num}'">Reply</button>
		</div>
	
	</div>
</body>
</html>