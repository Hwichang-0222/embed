<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>도서 등록</title>
    <link rel="stylesheet" href="/css/bootstrap.min.css" />
    <script src="/js/validation.js"></script>  <!-- ✅ validation.js 연결 -->
</head>
<body>
    <div class="container py-4">

        <jsp:include page="/bookmarket/menu.do" />

        <div class="p-5 mb-4 bg-body-tertiary rounded-3">
            <div class="container-fluid py-5">
                <h1 class="display-5 fw-bold">도서 등록</h1>
                <p class="col-md-8 fs-4">Add Book</p>
            </div>
        </div>

        <div class="row align-items-md-stretch">
            <div class="col-md-8">
                <form name="newBook" 
                      action="/bookmarket/processAddBook.do" 
                      method="post" 
                      enctype="multipart/form-data"
                      onsubmit="return checkAddBook()">  <!-- ✅ JS 유효성검사 호출 -->

                    <div class="mb-3 row">
                        <label for="bookId" class="col-sm-2 col-form-label">도서 ID</label>
                        <div class="col-sm-6">
                            <input type="text" id="bookId" name="bookId" class="form-control" placeholder="ISBN12345" required>
                        </div>
                    </div>

                    <div class="mb-3 row">
                        <label for="name" class="col-sm-2 col-form-label">도서명</label>
                        <div class="col-sm-6">
                            <input type="text" id="name" name="name" class="form-control" placeholder="도서명 입력" required>
                        </div>
                    </div>

                    <div class="mb-3 row">
                        <label for="unitPrice" class="col-sm-2 col-form-label">가격</label>
                        <div class="col-sm-6">
                            <input type="number" id="unitPrice" name="unitPrice" class="form-control" min="0" required>
                        </div>
                    </div>

                    <div class="mb-3 row">
                        <label for="author" class="col-sm-2 col-form-label">저자</label>
                        <div class="col-sm-6">
                            <input type="text" id="author" name="author" class="form-control" required>
                        </div>
                    </div>

                    <div class="mb-3 row">
                        <label for="publisher" class="col-sm-2 col-form-label">출판사</label>
                        <div class="col-sm-6">
                            <input type="text" id="publisher" name="publisher" class="form-control">
                        </div>
                    </div>

                    <div class="mb-3 row">
                        <label for="releaseDate" class="col-sm-2 col-form-label">출판일</label>
                        <div class="col-sm-6">
                            <input type="date" id="releaseDate" name="releaseDate" class="form-control">
                        </div>
                    </div>

                    <div class="mb-3 row">
                        <label for="description" class="col-sm-2 col-form-label">설명</label>
                        <div class="col-sm-8">
                            <textarea id="description" name="description" rows="4" class="form-control"></textarea>
                        </div>
                    </div>

                    <div class="mb-3 row">
                        <label for="unitsInStock" class="col-sm-2 col-form-label">재고 수량</label>
                        <div class="col-sm-6">
                            <input type="number" id="unitsInStock" name="unitsInStock" class="form-control" min="0" required>
                        </div>
                    </div>

                    <div class="mb-3 row">
                        <label for="bookImage" class="col-sm-2 col-form-label">도서 이미지</label>
                        <div class="col-sm-6">
                            <input type="file" id="bookImage" name="bookImage" class="form-control" accept="image/*">
                        </div>
                    </div>

                    <div class="mt-4">
                        <button type="submit" class="btn btn-success">등록</button>
                        <button type="reset" class="btn btn-secondary">초기화</button>
                        <a href="/bookmarket/books.do" class="btn btn-outline-dark">목록으로</a>
                    </div>
                </form>
            </div>
        </div>

        <jsp:include page="/bookmarket/footer.do" />

    </div>
</body>
</html>
