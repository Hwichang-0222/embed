package bbs.service;

import java.util.ArrayList;

import bbs.dao.BoardDAO;
import bbs.dto.BoardDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class BoardListService implements BoardService {
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		BoardDAO dao = new BoardDAO();
		ArrayList<BoardDTO> list = dao.list();
		req.setAttribute("list", list);
	}
}
