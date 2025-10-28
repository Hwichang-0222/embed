package org.embed.bbs.dto;

import lombok.Data;

@Data
public class BbsDTO {
    private int num;          // 글 번호 (PK)
    private String id;        // 작성자 ID
    private String name;      // 작성자 이름
    private String subject;   // 제목
    private String content;   // 내용
    private String registDay; // 등록일
    private int hit;          // 조회수
    private String ip;        // 작성자 IP
}
