package org.embed.controller;

import java.io.File;
import java.net.URLEncoder;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.embed.dto.BoardDTO;
import org.embed.dto.BoardFileDTO;
import org.embed.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletResponse;

@Controller
public class RestBoardController {
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value = "/board", method = RequestMethod.GET)
	public ModelAndView openBoardList() throws Exception {
//		log.info("=====> openBoardList");
//		log.debug("====> debug level log");
//		log.warn("=====> warn level log");
//		log.error("====> error level log");
//		log.trace("====> trace level log");
		ModelAndView mv = new ModelAndView("thymeleaf/board/restBoardList");
		List<BoardDTO> list = boardService.selectBoardList();
		mv.addObject("list", list);
		
		return mv;
	}
	
	@RequestMapping(value = "/board/write", method = RequestMethod.GET)
	public String openBoardWrite() throws Exception {
		return "thymeleaf/board/restBoardWrite";
	}
	
	@RequestMapping(value = "/board/write", method = RequestMethod.POST)
	public String insertBoard(BoardDTO board, MultipartHttpServletRequest req) throws Exception {
		boardService.insertBoard(board, req);
		return "redirect:/board";
	}
	
	@RequestMapping(value = "/board/{boardId}", method = RequestMethod.GET)
	public ModelAndView openBoardDetail(@PathVariable("boardId") int boardId) throws Exception {
		ModelAndView mv = new ModelAndView("thymeleaf/board/restBoardDetail");

		BoardDTO board = boardService.selectBoardDetail(boardId);
		mv.addObject("board", board);
		
		return mv;
	}
	
	@RequestMapping(value = "/board/{boardId}", method = RequestMethod.PUT)
	public String updateBoard(BoardDTO board) throws Exception {
		boardService.updateBoard(board);
		return "redirect:/board";
	}
	
	@RequestMapping(value = "/board/{boardId}", method = RequestMethod.DELETE)
	public String deleteBoard(@PathVariable("boardId") int boardId) throws Exception {
		boardService.deleteBoard(boardId);;
		return "redirect:/board";
	}
	
	@RequestMapping(value = "/board/file", method = RequestMethod.GET)
	public void downloadBoardFile(@RequestParam int id, @RequestParam int boardId, HttpServletResponse resp) throws Exception {
		
		try {
			BoardFileDTO boardFile = boardService.selectBoardFileInformation(id, boardId);
			if(ObjectUtils.isEmpty(boardFile) == false) {
				String fileName = boardFile.getOriginalFileName();
				
				byte[] files = FileUtils.readFileToByteArray(new File(boardFile.getStoredFilePath()));
				
				resp.setContentType("application/octet-stream");
				resp.setContentLength(files.length);
				resp.setHeader("Content-Disposition", "attachment; fileName=\"" + URLEncoder.encode(fileName,"UTF-8") + "\";");
				resp.setHeader("Content-Transfer-Encoding", "binary");
				
				resp.getOutputStream().write(files);
				resp.getOutputStream().flush();
				resp.getOutputStream().close();
			}
		} catch (Exception e) {
			// TODO: handle exception
			//log.error(e.getMessage());
		}
	}

}
