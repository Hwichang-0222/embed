package org.embed.noticeService;

import org.embed.dao.NoticeDAO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class NoticeDeleteService implements NoticeService {

    @Override
    public void excute(HttpServletRequest request, HttpServletResponse response) {
        int no = Integer.parseInt(request.getParameter("no"));

        NoticeDAO dao =NoticeDAO.getInstance();
        dao.deleteNotice(no);
    }
}