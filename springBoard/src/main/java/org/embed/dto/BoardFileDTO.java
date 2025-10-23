package org.embed.dto;

import lombok.Data;

@Data
public class BoardFileDTO {
	
	private int id;
	private int boardId;
	private String originalFileName;
	private String storedFilePath;
	private long fileSize;
	
}
