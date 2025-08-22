<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>게시글 작성</title>
    <link rel="stylesheet" type="text/css" href="board.css">
    <style>
        .write-container {
            max-width: 800px;
            margin: 0 auto;
            background: white;
            border-radius: 8px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            overflow: hidden;
        }
        
        .write-header {
            background: linear-gradient(135deg, #27ae60, #229954);
            color: white;
            padding: 20px;
            text-align: center;
        }
        
        .write-form {
            padding: 30px;
        }
        
        .form-group {
            margin-bottom: 25px;
        }
        
        .form-group label {
            display: block;
            margin-bottom: 8px;
            font-weight: bold;
            color: #555;
            font-size: 16px;
        }
        
        .form-group input[type="text"],
        .form-group textarea {
            width: 100%;
            padding: 15px;
            border: 2px solid #e0e0e0;
            border-radius: 6px;
            font-size: 16px;
            font-family: inherit;
            transition: all 0.3s ease;
        }
        
        .form-group input[type="text"]:focus,
        .form-group textarea:focus {
            outline: none;
            border-color: #27ae60;
            box-shadow: 0 0 0 3px rgba(39, 174, 96, 0.1);
            transform: translateY(-1px);
        }
        
        .form-group textarea {
            min-height: 250px;
            resize: vertical;
            line-height: 1.6;
        }
        
        .required {
            color: #e74c3c;
        }
        
        .form-actions {
            display: flex;
            justify-content: center;
            gap: 15px;
            margin-top: 40px;
            padding-top: 20px;
            border-top: 1px solid #eee;
            flex-wrap: wrap;
        }
        
        .btn {
            padding: 15px 30px;
            border: none;
            border-radius: 6px;
            text-decoration: none;
            font-weight: bold;
            cursor: pointer;
            transition: all 0.3s ease;
            display: inline-block;
            font-size: 16px;
        }
        
        .btn-primary {
            background: linear-gradient(135deg, #27ae60, #229954);
            color: white;
        }
        
        .btn-secondary {
            background: linear-gradient(135deg, #95a5a6, #7f8c8d);
            color: white;
        }
        
        .btn:hover {
            transform: translateY(-2px);
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
        }
        
        .form-help {
            font-size: 14px;
            color: #666;
            margin-top: 5px;
        }
        
        .char-counter {
            text-align: right;
            font-size: 12px;
            color: #999;
            margin-top: 5px;
        }
        
        @media (max-width: 768px) {
            .write-container {
                margin: 0 10px;
            }
            
            .write-form {
                padding: 20px;
            }
            
            .form-group input[type="text"],
            .form-group textarea {
                padding: 12px;
                font-size: 14px;
            }
            
            .form-actions {
                flex-direction: column;
                align-items: center;
            }
            
            .btn {
                width: 100%;
                max-width: 200px;
                padding: 12px 20px;
                font-size: 14px;
            }
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>새 게시글 작성</h1>
        
        <div class="write-container">
            <div class="write-header">
                <h2><i class="icon">✏️</i> 게시글 작성</h2>
                <p>새로운 게시글을 작성해주세요</p>
            </div>
            
            <form action="write.do" method="post" class="write-form" onsubmit="return validateForm()">
                <div class="form-group">
                    <label for="title">제목 <span class="required">*</span></label>
                    <input type="text" id="title" name="title" placeholder="제목을 입력하세요" required maxlength="100">
                    <div class="form-help">최대 100자까지 입력 가능합니다.</div>
                </div>
                
                <div class="form-group">
                    <label for="author">작성자 <span class="required">*</span></label>
                    <input type="text" id="author" name="author" placeholder="작성자명을 입력하세요" required maxlength="50">
                    <div class="form-help">최대 50자까지 입력 가능합니다.</div>
                </div>
                
                <div class="form-group">
                    <label for="content">내용 <span class="required">*</span></label>
                    <textarea id="content" name="content" placeholder="내용을 입력하세요" required maxlength="4000" oninput="updateCharCount()"></textarea>
                    <div class="char-counter">
                        <span id="charCount">0</span> / 4000자
                    </div>
                    <div class="form-help">최대 4000자까지 입력 가능합니다.</div>
                </div>
                
                <div class="form-actions">
                    <input type="submit" value="작성완료" class="btn btn-primary">
                    <a href="list.do" class="btn btn-secondary">목록으로</a>
                </div>
            </form>
        </div>
    </div>
    
    <script>
        function updateCharCount() {
            const content = document.getElementById('content');
            const charCount = document.getElementById('charCount');
            charCount.textContent = content.value.length;
            
            if (content.value.length > 3800) {
                charCount.style.color = '#e74c3c';
            } else {
                charCount.style.color = '#999';
            }
        }
        
        function validateForm() {
            const title = document.getElementById('title').value.trim();
            const author = document.getElementById('author').value.trim();
            const content = document.getElementById('content').value.trim();
            
            if (title === '') {
                alert('제목을 입력해주세요.');
                document.getElementById('title').focus();
                return false;
            }
            
            if (author === '') {
                alert('작성자명을 입력해주세요.');
                document.getElementById('author').focus();
                return false;
            }
            
            if (content === '') {
                alert('내용을 입력해주세요.');
                document.getElementById('content').focus();
                return false;
            }
            
            return confirm('게시글을 작성하시겠습니까?');
        }
        
        // 페이지 로드 시 글자 수 초기화
        document.addEventListener('DOMContentLoaded', function() {
            updateCharCount();
        });
    </script>
</body>
</html>