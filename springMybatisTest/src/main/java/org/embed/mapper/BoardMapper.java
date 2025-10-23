package org.embed.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.embed.domain.BoardDTO;

@Mapper
public interface BoardMapper {
	
	int insertBoard(BoardDTO board) throws Exception;
	List<BoardDTO> selectBoardList() throws Exception;
	BoardDTO selectBoardDetail(int boardId) throws Exception;
	int updateBoard(BoardDTO board) throws Exception;
	int deleteBoard(int boardId) throws Exception;

}
