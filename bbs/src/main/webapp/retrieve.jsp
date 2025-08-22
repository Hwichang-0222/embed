<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>게시글 상세보기</title>
    <link rel="stylesheet" type="text/css" href="board.css">
    <style>
        .post-detail-container {
            max-width: 800px;
            margin: 0 auto;
            background: white;
            border-radius: 8px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            overflow: hidden;
        }
        
        .post-header {
            background: linear-gradient(135deg, #4a5568 0%, #2d3748 100%);
            color: white;
            padding: 20px;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }
        
        .post-info {
            display: flex;
            gap: 20px;
            font-size: 14px;
        }
        
        .post-form {
            padding: 30px;
        }
        
        .form-group {
            margin-bottom: 20px;
        }
        
        .form-group label {
            display: block;
            margin-bottom: 8px;
            font-weight: bold;
            color: #555;
        }
        
        .form-group input[type="text"],
        .form-group textarea {
            width: 100%;
            padding: 12px;
            border: 2px solid #e0e0e0;
            border-radius: 6px;
            font-size: 14px;
            font-family: inherit;
            transition: border-color 0.3s ease;
        }
        
        .form-group input[type="text"]:focus,
        .form-group textarea:focus {
            outline: none;
            border-color: #4a5568;
            box-shadow: 0 0 0 3px rgba(74, 85, 104, 0.1);
        }
        
        .form-group textarea {
            min-height: 200px;
            resize: vertical;
        }
        
        .action-buttons {
            display: flex;
            justify-content: center;
            gap: 10px;
            margin-top: 30px;
            padding: 20px;
            background: #f8f9fa;
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
            background: linear-gradient(135deg, #4a5568, #2d3748);
            color: white;
        }
        
        .btn-success {
            background: linear-gradient(135deg, #38a169, #2f855a);
            color: white;
        }
        
        .btn-danger {
            background: linear-gradient(135deg, #e53e3e, #c53030);
            color: white;
        }
        
        .btn-warning {
            background: linear-gradient(135deg, #d69e2e, #b7791f);
            color: white;
        }
        
        .btn:hover {
            transform: translateY(-2px);
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
        }
        
        @media (max-width: 768px) {
            .post-header {
                flex-direction: column;
                gap: 10px;
                text-align: center;
            }
            
            .post-info {
                justify-content: center;
            }
            
            .post-form {
                padding: 20px;
            }
            
            .action-buttons {
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
        <h1>게시글 상세보기</h1>
        
        <div class="post-detail-container">
            <div class="post-header">
                <h2>게시글 #${retrieve.num}</h2>
                <div class="post-info">
                    <span>조회수: ${retrieve.readCnt}</span>
                </div>
            </div>
            
            <form action="update.do" method="post" class="post-form">
                <input type="hidden" name="num" value="${retrieve.num}">
                
                <div class="form-group">
                    <label for="title">제목</label>
                    <input type="text" id="title" name="title" value="${retrieve.title}" required>
                </div>
                
                <div class="form-group">
                    <label for="author">작성자</label>
                    <input type="text" id="author" name="author" value="${retrieve.author}" required>
                </div>
                
                <div class="form-group">
                    <label for="content">내용</label>
                    <textarea id="content" name="content" required>${retrieve.content}</textarea>
                </div>
                
                <div style="text-align: center;">
                    <input type="submit" value="수정하기" class="btn btn-primary">
                </div>
            </form>
            
            <div class="action-buttons">
                <a href="list.do" class="btn btn-success">목록으로</a>
                <a href="replyui.do?num=${retrieve.num}" class="btn btn-warning">답글달기</a>
                <a href="delete.do?num=${retrieve.num}" class="btn btn-danger" 
                   onclick="return confirm('정말로 삭제하시겠습니까?')">삭제하기</a>
            </div>
        </div>
    </div>
</body>
</html>