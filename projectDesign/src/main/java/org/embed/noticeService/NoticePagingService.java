package org.embed.noticeService;

import java.util.ArrayList;

import org.embed.dao.NoticeDAO;
import org.embed.dto.NoticeDTO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class NoticePagingService implements NoticeService {

    @Override
    public void excute(HttpServletRequest request, HttpServletResponse response) {
        int pageSize = 10;
        int currentPage = 1;

        String pageParam = request.getParameter("page");
        if (pageParam != null && !pageParam.isEmpty()) {
            currentPage = Integer.parseInt(pageParam);
        }

        int startRow = (currentPage - 1) * pageSize;


        NoticeDAO dao = NoticeDAO.getInstance();
        ArrayList<NoticeDTO> list = dao.getPagedList(startRow, pageSize);
        int totalCount = dao.getTotalCount();
        int totalPage = (int) Math.ceil((double) totalCount / pageSize);

        request.setAttribute("noticeList", list);
        request.setAttribute("currentPage", currentPage);
        request.setAttribute("totalPage", totalPage);

    }
}