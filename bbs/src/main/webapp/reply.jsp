<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>답글 작성</title>
    <link rel="stylesheet" type="text/css" href="board.css">
    <style>
        .reply-container {
    max-width: 800px;
    margin: 0 auto;
    padding: 0 15px;
}

/* 원본 게시글 */
.original-post {
    background: white;
    border-radius: 8px;
    box-shadow: 0 2px 6px rgba(0, 0, 0, 0.05);
    margin-bottom: 30px;
    overflow: hidden;
}

.original-post-header {
    background: #007bff;
    color: white;
    padding: 15px 20px;
    font-weight: bold;
    font-size: 16px;
}

.original-post-content {
    padding: 20px;
    background: #f4f6f8;
    border-left: 4px solid #007bff;
}

.original-post-info {
    display: flex;
    gap: 20px;
    margin-bottom: 15px;
    font-size: 14px;
    color: #555;
    flex-wrap: wrap;
}

/* 답글 폼 */
.reply-form-container {
    background: white;
    border-radius: 8px;
    box-shadow: 0 4px 10px rgba(0, 0, 0, 0.05);
    overflow: hidden;
}

.reply-form-header {
    background: #0056b3;
    color: white;
    padding: 20px;
    font-size: 18px;
    font-weight: bold;
}

.reply-form {
    padding: 30px;
}

.form-group {
    margin-bottom: 20px;
}

.form-group label {
    display: block;
    margin-bottom: 8px;
    font-weight: bold;
    color: #333;
}

.form-group input[type="text"],
.form-group textarea {
    width: 100%;
    padding: 12px;
    border: 1px solid #ccc;
    border-radius: 6px;
    font-size: 14px;
    font-family: inherit;
    transition: border-color 0.3s ease;
}

.form-group input[type="text"]:focus,
.form-group textarea:focus {
    outline: none;
    border-color: #007bff;
    box-shadow: 0 0 0 3px rgba(0, 123, 255, 0.1);
}

.form-group textarea {
    min-height: 150px;
    resize: vertical;
}

/* 버튼 */
.form-actions {
    display: flex;
    justify-content: center;
    gap: 15px;
    margin-top: 30px;
    flex-wrap: wrap;
}

.btn {
    padding: 12px 24px;
    border: none;
    border-radius: 6px;
    text-decoration: none;
    font-weight: bold;
    cursor: pointer;
    transition: all 0.3s ease;
    display: inline-block;
}

.btn-primary {
    background-color: #007bff;
    color: white;
}

.btn-secondary {
    background-color: #6c757d;
    color: white;
}

.btn:hover {
    transform: translateY(-2px);
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
}

/* 반응형 */
@media (max-width: 768px) {
    .original-post-info {
        flex-direction: column;
        gap: 5px;
    }

    .reply-form {
        padding: 20px;
    }

    .form-actions {
        flex-direction: column;
        align-items: center;
    }

    .btn {
        width: 100%;
        max-width: 200px;
    }
}

    </style>
</head>
<body>
    <div class="container">
        <h1>답글 작성</h1>
        
        <div class="reply-container">
            <!-- 원본 게시글 표시 -->
            <div class="original-post">
                <div class="original-post-header">
                    <i class="icon">📝</i> 원본 게시글
                </div>
                <div class="original-post-content">
                    <div class="original-post-info">
                        <span><strong>글번호:</strong> ${replyui.num}</span>
                        <span><strong>조회수:</strong> ${replyui.readCnt}</span>
                    </div>
                    <div class="form-group">
                        <strong>제목:</strong> ${replyui.title}
                    </div>
                    <div class="form-group">
                        <strong>작성자:</strong> ${replyui.author}
                    </div>
                    <div class="form-group">
                        <strong>내용:</strong><br>
                        <div style="background: white; padding: 15px; border-radius: 4px; margin-top: 5px;">
                            ${replyui.content}
                        </div>
                    </div>
                </div>
            </div>
            
            <!-- 답글 작성 폼 -->
            <div class="reply-form-container">
                <div class="reply-form-header">
                    <h2><i class="icon">💬</i> 답글 작성</h2>
                </div>
                
                <form action="reply.do" method="post" class="reply-form">
                    <input type="hidden" name="num" value="${retrieve.num}">
                    <input type="hidden" name="repRoot" value="${replyui.repRoot}">
                    <input type="hidden" name="repStep" value="${replyui.repStep}">
                    <input type="hidden" name="repIndent" value="${replyui.repIndent}">
                    
                    <div class="form-group">
                        <label for="title">제목</label>
                        <input type="text" id="title" name="title" value="Re: ${replyui.title}" required>
                    </div>
                    
                    <div class="form-group">
                        <label for="author">작성자</label>
                        <input type="text" id="author" name="author" placeholder="작성자명을 입력하세요" required>
                    </div>
                    
                    <div class="form-group">
                        <label for="content">내용</label>
                        <textarea id="content" name="content" placeholder="답글 내용을 입력하세요" required></textarea>
                    </div>
                    
                    <div class="form-actions">
                        <input type="submit" value="답글 등록" class="btn btn-primary">
                        <a href="list.do" class="btn btn-secondary">목록으로</a>
                    </div>
                </form>
            </div>
        </div>
    </div>
</body>
</html>