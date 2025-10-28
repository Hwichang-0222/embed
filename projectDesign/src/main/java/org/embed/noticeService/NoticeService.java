package org.embed.noticeService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface NoticeService {
	
	public void excute(HttpServletRequest req, HttpServletResponse resp);

}
