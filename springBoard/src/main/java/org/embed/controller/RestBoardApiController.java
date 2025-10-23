package org.embed.controller;

import java.util.List;

import org.embed.dto.BoardDTO;
import org.embed.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class RestBoardApiController {
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value = "/api/board", method = RequestMethod.GET)
	public List<BoardDTO> openBoardList() throws Exception {
		return boardService.selectBoardList();
	}
	
	@RequestMapping(value = "/api/board/write", method = RequestMethod.POST)
	public void insertBoard(@RequestBody BoardDTO board) throws Exception {
		boardService.insertBoard(board, null);
	}
	
	@RequestMapping(value = "/api/board/{boardId}", method = RequestMethod.GET)
	public BoardDTO openBoardDetail(@PathVariable("boardId") int boardId) throws Exception {
		return boardService.selectBoardDetail(boardId);
	}
	
	@RequestMapping(value = "/api/board/{boardId}", method = RequestMethod.PUT)
	public String updateBoard(@PathVariable("boardId") int boardId, @RequestBody BoardDTO board) throws Exception {
		board.setBoardId(boardId);
		boardService.updateBoard(board);
		return "redirect:/board";
	}
	
	@RequestMapping(value = "/api/board/{boardId}", method = RequestMethod.DELETE)
	public String deleteBoard(@PathVariable("boardId") int boardId) throws Exception {
		boardService.deleteBoard(boardId);;
		return "redirect:/board";
	}

}
