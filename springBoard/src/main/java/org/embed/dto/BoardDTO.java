package org.embed.dto;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Data;

@Data
public class BoardDTO {
	
	private int boardId;
	
	private String title;
	
	private String contents;
	
	private int hitCnt;
	
	private String creatorId;
	
	private LocalDateTime createdDatetime;
	
	private String updaterId;
	
	private LocalDateTime updaterDatetime;
	
	private List<BoardFileDTO> fileList;

}
