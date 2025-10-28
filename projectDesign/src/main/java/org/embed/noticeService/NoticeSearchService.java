package org.embed.noticeService;

import java.util.ArrayList;

import org.embed.dao.NoticeDAO;
import org.embed.dto.NoticeDTO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class NoticeSearchService implements NoticeService {
    @Override
    public void excute(HttpServletRequest req, HttpServletResponse resp) {
        String col = req.getParameter("search_col");
        String val = req.getParameter("search_value");

        // 컬럼명 매핑
        if ("search_title".equals(col)) col = "title";
        else if ("search_content".equals(col)) col = "content";
        else if ("search_writer".equals(col)) col = "writer";

        NoticeDAO dao = NoticeDAO.getInstance();
        ArrayList<NoticeDTO> list = dao.searchNotice(col, val);

        req.setAttribute("noticeList", list);
    }
}