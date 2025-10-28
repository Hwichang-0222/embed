<%@page contentType="text/html; charset=utf-8"%>
<%@page import="org.apache.commons.fileupload.*"%>
<%@page import="java.util.*"%>
<%@page import="java.io.*"%>
<html>
<head>
<title>File Upload</title>
</head>
<body>
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