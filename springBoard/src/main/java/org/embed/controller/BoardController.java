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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	//private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping("/board/test.do")
	public String test() {
		return "test";
	}
	
	//게시판 목록 보기
	@RequestMapping("/board/openBoardList.do") //주소 설정
	public ModelAndView openBoardList() throws Exception {
		log.info("=====> openBoardList");
//		log.debug("====> debug level log");
//		log.warn("=====> warn level log");
//		log.error("====> error level log");
//		log.trace("====> trace level log");
		
		ModelAndView mv = new ModelAndView("thymeleaf/board/boardList");
		
		List<BoardDTO> list = boardService.selectBoardList();
		mv.addObject("list", list);
		
		return mv;
	}
	
	//게시글 작성으로 주소넘겨주기
	@RequestMapping("/board/openBoardWrite.do")
	public String openBoardWrite() throws Exception {
		return "thymeleaf/board/boardWrite";
	}
	
	@RequestMapping("/board/insertBoard.do")
	public String insertBoard(BoardDTO board, MultipartHttpServletRequest req) throws Exception {
		boardService.insertBoard(board, req);
		return "redirect:/board/openBoardList.do";
	}
	
	@RequestMapping("/board/openBoardDetail.do")
	public ModelAndView openBoardDetail(@RequestParam("boardId") int boardId) throws Exception {
		ModelAndView mv = new ModelAndView("thymeleaf/board/boardDetail");

		BoardDTO board = boardService.selectBoardDetail(boardId);
		mv.addObject("board", board);
		
		return mv;
	}
	
	@RequestMapping("/board/updateBoard.do")
	public String updateBoard(BoardDTO board) throws Exception {
		boardService.updateBoard(board);
		return "redirect:/board/openBoardList.do";
	}
	
	@RequestMapping("/board/deleteBoard.do")
	public String deleteBoard(int boardId) throws Exception {
		boardService.deleteBoard(boardId);;
		return "redirect:/board/openBoardList.do";
	}
	
	@RequestMapping("/board/downloadBoardFile.do")
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
			log.error(e.getMessage());
		}
	}
	
}
