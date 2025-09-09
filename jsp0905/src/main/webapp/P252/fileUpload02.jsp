<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="org.apache.commons.fileupload.*, java.io.*, java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일 업로드</title>
</head>
<body>

<form action="fileupload02_process.jsp" method="post" enctype="multipart/form-data">
		<p>파 일 : <input type="file" name="filename">
		<p><input type="submit" value="파일올리기">
	</form>
	<%
		String fileUploadPath = "C:\\Temp";
	
		DiskFileUpload upload = new DiskFileUpload();
		
		List items = upload.parseRequest(request);
		
		Iterator params = items.iterator();
		
		while (params.hasNext()) {
			FileItem item = (FileItem) params.next();
			if (item.isFormField()) {
				String title = item.getString("UTF-8");
				out.println("<h3>" + title + "</h3>");
			} else {
				String fileName = item.getName();
				fileName = fileName.substring(fileName.lastIndexOf("\\") + 1);
				File file = new File(fileUploadPath + "/" + fileName);
				item.write(file);
				out.println("<h3>파일 이름 : " + fileName + "</h3>");
			}
		}
		
		
	%>
</body>
</html>