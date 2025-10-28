package org.embed.domain;

import java.time.LocalDateTime;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardDTO {
	
	private int boardId;
	private String title;
	private String contents;
	private int hitCnt;
	@JsonSerialize(using = LocalDateTimeSerializer.class)
	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
	@JsonFormat(pattern = "yyyy-MM-dd kk:mm:ss")
	private LocalDateTime createdDatetime;
	private String creatorId;
	@JsonSerialize(using = LocalDateTimeSerializer.class)
	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
	@JsonFormat(pattern = "yyyy-MM-dd kk:mm:ss")
	private LocalDateTime updatedDatetime;
	private String updaterId;
	private char deletedYn;

}
