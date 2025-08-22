package bbs.service;

import bbs.dao.BoardDAO;
import bbs.dto.PageTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class BoardSearchService implements BoardService {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		String searchName = req.getParameter("searchName");
		String searchValue = req.getParameter("searchValue");
		int curPage = req.getParameter("curPage") != null ? Integer.parseInt(req.getParameter("curPage")) : 1;

		BoardDAO dao = new BoardDAO();
		PageTO to = dao.searchPage(curPage, searchName, searchValue);

		req.setAttribute("list", to.getList());
		req.setAttribute("page", to);
		req.setAttribute("searchName", searchName);
		req.setAttribute("searchValue", searchValue);

	}
}
