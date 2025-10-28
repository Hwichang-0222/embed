package org.embed.service;

import java.util.List;

import org.embed.dto.BookDTO;
import org.springframework.web.multipart.MultipartHttpServletRequest;

public interface BookService {
	
	// 모든 도서 조회
	List<BookDTO> selectAllBooks() throws Exception;
	
	// 도서 ID로 조회
	BookDTO selectBookById(String bookId) throws Exception;
	
	// 도서 등록 (파일 업로드 포함)
	void insertBook(BookDTO book, MultipartHttpServletRequest req) throws Exception;
	
	// 도서 수정 (파일 업로드 포함)
	void updateBook(BookDTO book, MultipartHttpServletRequest req) throws Exception;
	
	// 도서 삭제
	void deleteBook(String bookId) throws Exception;
	
}