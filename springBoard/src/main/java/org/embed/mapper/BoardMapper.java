package org.embed.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.embed.dto.BoardDTO;
import org.embed.dto.BoardFileDTO;

@Mapper
public interface BoardMapper {
	
	List<BoardDTO> selectBoardList() throws Exception;
	
	void insertBoard(BoardDTO board) throws Exception;
	
	void insertBoardFileList(List<BoardFileDTO> list) throws Exception;
	
	BoardDTO selectBoardDetail(int BoardId) throws Exception;
	
	void updateHitCount(int boardId) throws Exception;
	
	void updateBoard(BoardDTO board) throws Exception;
	
	void deleteBoard(int BoardId) throws Exception;
	
	List<BoardFileDTO> selectBoardFileList(int boardId) throws Exception;
	
	BoardFileDTO selectBoardFileInformation(@Param("id") int id, @Param("boardId") int boardId) throws Exception;

}
