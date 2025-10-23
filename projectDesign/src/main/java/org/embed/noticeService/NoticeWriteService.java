package org.embed.noticeService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.embed.dao.NoticeDAO;
import org.embed.dto.NoticeDTO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class NoticeWriteService implements NoticeService{
	
	@Override
	public void excute(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		LocalDate today = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String formattedDate = today.format(formatter);

		NoticeDTO dto = new NoticeDTO();
		
		dto.setTitle(req.getParameter("title"));
		dto.setWriter(req.getParameter("writer"));
		dto.setWrite_day(formattedDate);
		dto.setStatus(req.getParameter("status"));
		dto.setContent(req.getParameter("content"));
		
		NoticeDAO dao = NoticeDAO.getInstance();
		dao.noticeWrite(dto);
	}
}