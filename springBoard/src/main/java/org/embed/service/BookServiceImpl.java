package org.embed.service;

import java.util.List;

import org.embed.common.FileUtils;
import org.embed.dto.BookDTO;
import org.embed.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.Iterator;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookMapper bookMapper;
	
	@Autowired
	private FileUtils fileUtils;
	
	@Override
	public List<BookDTO> selectAllBooks() throws Exception {
		return bookMapper.selectAllBooks();
	}
	
	@Override
	public BookDTO selectBookById(String bookId) throws Exception {
		return bookMapper.selectBookById(bookId);
	}
	
	@Override
	public void insertBook(BookDTO book, MultipartHttpServletRequest req) throws Exception {
		// 파일 처리
		if (req != null) {
			String filename = uploadFile(req);
			if (filename != null) {
				book.setFilename(filename);
			}
		}
		
		bookMapper.insertBook(book);
	}
	
	@Override
	public void updateBook(BookDTO book, MultipartHttpServletRequest req) throws Exception {
		// 파일 처리
		if (req != null) {
			String filename = uploadFile(req);
			if (filename != null) {
				book.setFilename(filename);
			}
		}
		
		bookMapper.updateBook(book);
	}
	
	@Override
	public void deleteBook(String bookId) throws Exception {
		bookMapper.deleteBook(bookId);
	}
	
	// 파일 업로드 처리
	// 파일 업로드 처리
	private String uploadFile(MultipartHttpServletRequest req) throws Exception {
	    Iterator<String> iterator = req.getFileNames();

	    if (iterator.hasNext()) {
	        String fileName = iterator.next();
	        MultipartFile multipartFile = req.getFile(fileName);

	        if (multipartFile != null && !multipartFile.isEmpty()) {
	            String originalFilename = multipartFile.getOriginalFilename();
	            String extension = "";

	            if (originalFilename != null && originalFilename.contains(".")) {
	                extension = originalFilename.substring(originalFilename.lastIndexOf("."));
	            }

	            // 고유한 파일명 생성
	            String newFileName = System.nanoTime() + extension;

	            // ✅ 실제 런타임 기준 정적 경로
	            String uploadPath = new java.io.File("src/main/resources/static/images").getAbsolutePath();

	            // 폴더가 없으면 생성
	            java.io.File uploadDir = new java.io.File(uploadPath);
	            if (!uploadDir.exists()) {
	                uploadDir.mkdirs();
	            }

	            // 파일 저장
	            java.io.File dest = new java.io.File(uploadPath, newFileName);
	            multipartFile.transferTo(dest);

	            System.out.println("=====> [파일 업로드 성공] " + dest.getAbsolutePath());

	            return newFileName;
	        }
	    }
	    return null;
	}

}