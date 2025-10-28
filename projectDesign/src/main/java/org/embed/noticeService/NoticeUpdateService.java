package org.embed.noticeService;

import org.embed.dao.NoticeDAO;
import org.embed.dto.NoticeDTO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class NoticeUpdateService implements NoticeService {

    @Override
    public void excute(HttpServletRequest request, HttpServletResponse response) {
        int no = Integer.parseInt(request.getParameter("no"));
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        String status = "수정글";

        NoticeDTO dto = new NoticeDTO();
        dto.setNo(no);
        dto.setTitle(title);
        dto.setContent(content);
        dto.setStatus(status);

        NoticeDAO dao = NoticeDAO.getInstance();
        dao.updateNotice(dto); // DB에 수정 반영
    }
}
