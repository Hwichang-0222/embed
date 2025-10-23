package org.embed.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.embed.dto.BookDTO;

@Mapper
public interface BookMapper {
	
	// 모든 도서 조회
	List<BookDTO> selectAllBooks() throws Exception;
	
	// 도서 ID로 조회
	BookDTO selectBookById(String bookId) throws Exception;
	
	// 도서 등록
	void insertBook(BookDTO book) throws Exception;
	
	// 도서 수정
	void updateBook(BookDTO book) throws Exception;
	
	// 도서 삭제
	void deleteBook(String bookId) throws Exception;
	
}