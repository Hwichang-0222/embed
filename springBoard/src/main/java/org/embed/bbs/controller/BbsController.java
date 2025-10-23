package org.embed.bbs.controller;

import org.embed.bbs.dto.BbsDTO;
import org.embed.bbs.service.BbsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/bookmarket/bbs")
public class BbsController {

    @Autowired
    private BbsService bbsService;

    /** ✅ [공통 메서드 1] 세션에서 로그인 아이디 반환 */
    private String getSessionId(HttpSession session) {
        return (String) session.getAttribute("sessionId");
    }

    /** ✅ [공통 메서드 2] 로그인 안 했을 경우 redirect URL 반환 (로그인 페이지로) */
    private String redirectIfNotLogin(HttpSession session) {
        return getSessionId(session) == null ? "redirect:/bookmarket/member/loginMember.do" : null;
    }

    /** ✅ [공통 메서드 3] 작성자 본인 여부 확인 */
    private boolean isOwner(BbsDTO post, String sessionId) {
        return post != null && sessionId != null && sessionId.equals(post.getId());
    }

    /** ✅ 게시글 목록 */
    @GetMapping("/list.do")
    public String list(@RequestParam(value = "page", defaultValue = "1") int page, Model model) {
        int pageSize = 10; // 한 페이지 게시글 수
        int totalCount = bbsService.getBbsCount();
        int totalPages = (int) Math.ceil((double) totalCount / pageSize);

        model.addAttribute("posts", bbsService.getPagedBbs(page, pageSize));
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", totalPages);
        model.addAttribute("totalCount", totalCount);

        return "bbs/list";
    }


    /** ✅ 게시글 상세 조회 */
    @GetMapping("/view.do")
    public String view(@RequestParam("num") int num, Model model) {
        bbsService.updateHitCount(num);
        model.addAttribute("post", bbsService.getBbsByNum(num));
        return "bbs/view";
    }

    /** ✅ 글쓰기 폼 */
    @GetMapping("/writeForm.do")
    public String writeForm(HttpSession session) {
        String redirect = redirectIfNotLogin(session);
        if (redirect != null) return redirect;
        return "bbs/writeForm";
    }

    /** ✅ 글쓰기 처리 */
    @PostMapping("/write.do")
    public String write(@ModelAttribute BbsDTO dto,
                        HttpServletRequest req,
                        HttpSession session) {

        String redirect = redirectIfNotLogin(session);
        if (redirect != null) return redirect;

        dto.setId(getSessionId(session));
        dto.setIp(req.getRemoteAddr());
        bbsService.insertBbs(dto);

        return "redirect:/bookmarket/bbs/list.do";
    }

    /** ✅ 글 수정 (완료 버튼 클릭 시) */
    @PostMapping("/edit.do")
    public String edit(@ModelAttribute BbsDTO dto, HttpSession session) {
        String redirect = redirectIfNotLogin(session);
        if (redirect != null) return redirect;

        String sessionId = getSessionId(session);
        BbsDTO post = bbsService.getBbsByNum(dto.getNum());

        if (!isOwner(post, sessionId)) {
            return "redirect:/bookmarket/bbs/view.do?num=" + dto.getNum();
        }

        bbsService.updateBbs(dto);
        return "redirect:/bookmarket/bbs/view.do?num=" + dto.getNum();
    }

    /** ✅ 글 삭제 */
    @GetMapping("/delete.do")
    public String delete(@RequestParam("num") int num, HttpSession session) {
        String redirect = redirectIfNotLogin(session);
        if (redirect != null) return redirect;

        String sessionId = getSessionId(session);
        BbsDTO post = bbsService.getBbsByNum(num);

        if (!isOwner(post, sessionId)) {
            return "redirect:/bookmarket/bbs/view.do?num=" + num;
        }

        bbsService.deleteBbs(num);
        return "redirect:/bookmarket/bbs/list.do";
    }
}
