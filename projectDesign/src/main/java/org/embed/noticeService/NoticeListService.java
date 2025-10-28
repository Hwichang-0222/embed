package org.embed.noticeService;

import java.util.ArrayList;

import org.embed.dao.NoticeDAO;
import org.embed.dto.NoticeDTO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class NoticeListService implements NoticeService{
	
	@Override
	public void excute(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		NoticeDAO dao = NoticeDAO.getInstance();
		ArrayList<NoticeDTO> list = dao.noticeList();
		
		req.setAttribute("noticeList", list);
	}

}
