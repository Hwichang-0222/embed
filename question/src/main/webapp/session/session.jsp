<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Session</title>
</head>
<body>
    <h2>학생 정보 입력</h2>
    <form action="session_process.jsp" method="post">
        아 이 디: <input type="text" name="id"><br>
        비밀번호: <input type="password" name="password"><br>
        
        <input type="submit" value="전송">
    </form>
</body>
</html>