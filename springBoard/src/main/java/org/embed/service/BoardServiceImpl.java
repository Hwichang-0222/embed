package org.embed.service;

import java.util.List;

import org.embed.common.FileUtils;
import org.embed.dto.BoardDTO;
import org.embed.dto.BoardFileDTO;
import org.embed.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	private BoardMapper boardMapper;
	
	@Autowired
	private FileUtils fileUtils; 
	
	@Override
	public List<BoardDTO> selectBoardList() throws Exception {
		// TODO Auto-generated method stub
		return boardMapper.selectBoardList();
	}
	
	@Override
	public void insertBoard(BoardDTO board, MultipartHttpServletRequest req) throws Exception {
		// TODO Auto-generated method stub
		boardMapper.insertBoard(board);
		List<BoardFileDTO> list = fileUtils.parseFileInfo(board.getBoardId(), req);
		if(CollectionUtils.isEmpty(list) == false)
			boardMapper.insertBoardFileList(list);
	}
	
	@Override
	public BoardDTO selectBoardDetail(int BoardId) throws Exception {
		// TODO Auto-generated method stub
		BoardDTO board = boardMapper.selectBoardDetail(BoardId);
		List<BoardFileDTO> fileList = boardMapper.selectBoardFileList(BoardId);
		board.setFileList(fileList);
		
		boardMapper.updateHitCount(BoardId);
		
		return board;
	}
	
	@Override
	public void updateBoard(BoardDTO board) throws Exception {
		// TODO Auto-generated method stub
		boardMapper.updateBoard(board);		
	}
	
	@Override
	public void deleteBoard(int BoardId) throws Exception {
		// TODO Auto-generated method stub
		boardMapper.deleteBoard(BoardId);
	}
	
	@Override
	public BoardFileDTO selectBoardFileInformation(int id, int boardId) throws Exception {
		// TODO Auto-generated method stub
		return boardMapper.selectBoardFileInformation(id, boardId);
	}

}
