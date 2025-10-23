package org.embed.noticeService;

import org.embed.dao.NoticeDAO;
import org.embed.dto.NoticeDTO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class NoticeUpdateRetrieveService implements NoticeService {

    @Override
    public void excute(HttpServletRequest request, HttpServletResponse response) {
        String noStr = request.getParameter("no");
        int no = Integer.parseInt(noStr);

        NoticeDAO dao = NoticeDAO.getInstance();
        NoticeDTO dto = dao.getNoticeByNo(no); // 기존 공지사항 조회

        request.setAttribute("nData", dto); // JSP에서 사용할 데이터
    }
}
