package org.embed.noticeService;

import org.embed.dao.NoticeDAO;
import org.embed.dto.NoticeDTO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class NoticeReadService implements NoticeService{
	
	@Override
	public void excute(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		int no = Integer.parseInt(req.getParameter("no"));
		
		NoticeDAO dao = NoticeDAO.getInstance();
		NoticeDTO nData = dao.noticeRead(no);
		
		req.setAttribute("nData", nData);
	}

}
