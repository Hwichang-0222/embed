package org.embed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/bookmarket/member")
public class MemberController {

    // 로그인 페이지
    @GetMapping("/loginMember.do")
    public String loginPage() {
        return "member/loginMember";
    }

    // 로그인 처리 (processLoginMember.jsp로 이동)
    @PostMapping("/processLoginMember.do")
    public String processLoginMember() {
        return "member/processLoginMember";
    }

    // 결과 페이지
    @GetMapping("/resultMember.do")
    public String resultMember() {
        return "member/resultMember";
    }

    // 회원가입 페이지
    @GetMapping("/addMember.do")
    public String addMemberPage() {
        return "member/addMember";
    }

    // 회원가입 처리 (processAddMember.jsp로 이동)
    @PostMapping("/processAddMember.do")
    public String processAddMember() {
        return "member/processAddMember";
    }

    // 로그아웃 (세션 무효화)
    @GetMapping("/logoutMember.do")
    public String logoutMember(HttpSession session) {
        log.info("=====> 로그아웃");
        session.invalidate();
        return "redirect:/bookmarket/welcome.do";
    }

    // 회원 탈퇴 (deleteMember.jsp로 이동)
    @GetMapping("/deleteMember.do")
    public String deleteMember() {
        return "member/deleteMember";
    }

    // 회원 수정 페이지
    @GetMapping("/updateMember.do")
    public String updateMemberPage() {
        return "member/updateMember";
    }

    // 회원 수정 처리 (processUpdateMember.jsp로 이동)
    @PostMapping("/processUpdateMember.do")
    public String processUpdateMember() {
        return "member/processUpdateMember";
    }
}