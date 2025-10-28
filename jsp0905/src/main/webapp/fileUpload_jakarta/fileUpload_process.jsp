<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="org.apache.commons.fileupload2.core.*, org.apache.commons.fileupload2.jakarta.*" %>
<%@ page import="java.nio.charset.*" %>
<%@ page import="java.io.*, java.util.*" %>

<%
	String uploadPath = "C:/Temp/";

	File uploadDir = new File(uploadPath);
	
	if (!uploadDir.exists()) {
		uploadDir.mkdirs();
	}
	
	request.setCharacterEncoding("UTF-8");
	
	File repository = new File(System.getProperty("java.io.tmpdir"));
	FileItemFactory factory = DiskFileItemFactory.builder().setFile(repository).get();
	
	JakartaServletFileUpload upload = new JakartaServletFileUpload(factory);
	JakartaServletRequestContext context = new JakartaServletRequestContext(request);
	
	try {
		
		List<FileItem> items = upload.parseRequest(context);
		
		for (FileItem item : items) {
			if (item.isFormField()) {
				out.println(item.getFieldName() + " : " + item.getString(StandardCharsets.UTF_8) + "<br>");
			} else {
				String fieldName = item.getFieldName();
				String fileName = item.getName();
				String uploadName = System.currentTimeMillis() + "_" + fileName;
				
				if (fileName != null && !fileName.isEmpty()) {
					File uploadFile = new File(uploadDir, fileName);
					
					try {
						InputStream is = item.getInputStream();
						FileOutputStream fos = new FileOutputStream(uploadFile);
						
						is.transferTo(fos);
						
						out.println("===========================================<br>");
						out.println("필드 이름 : " + fieldName + "<br>");
						out.println("원본 파일명 : " + fileName + "<br>");
						out.println("저장 파일명 : " + uploadName + "<br>");
						out.println("type : " + item.getContentType() + "<br>");
						out.println("Path : " + uploadFile.getAbsolutePath() + "<br>");
						out.println("Size : " + uploadFile.length() + "<br>");
						out.println("===========================================<br>");
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
		
	} catch (Exception e) {
		out.println("파일 업로드중 에러 발생");
		e.printStackTrace();
	}
	
	
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자카르타 파일 업로드</title>
</head>
<body>
	
</body>
</html>