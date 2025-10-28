package org.embed.dto;

public class NoticeDTO {
	
	private int no;
	private String title;
	private String content;
	private String writer;
	private int count;
	private String write_day;
	private String status;
	
	public NoticeDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getWrite_day() {
		return write_day;
	}
	public void setWrite_day(String write_day) {
		this.write_day = write_day;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
