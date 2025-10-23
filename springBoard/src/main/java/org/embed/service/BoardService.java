package org.embed.service;

import java.util.List;

import org.embed.dto.BoardDTO;
import org.embed.dto.BoardFileDTO;
import org.springframework.web.multipart.MultipartHttpServletRequest;

public interface BoardService {

	List<BoardDTO> selectBoardList() throws Exception;

	void insertBoard (BoardDTO board, MultipartHttpServletRequest req) throws Exception;
	
	BoardDTO selectBoardDetail (int BoardId) throws Exception;
	
	void updateBoard (BoardDTO board) throws Exception;
	
	void deleteBoard (int BoardId) throws Exception;
	
	BoardFileDTO selectBoardFileInformation(int id, int boardId) throws Exception;
}
