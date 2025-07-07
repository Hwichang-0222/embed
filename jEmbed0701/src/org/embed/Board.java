package org.embed;

public class Board {
	
	String title;
	String content;
	String writer;
	String date;
	int hitCount;
	
	public Board(String title, String content) {
		this(title, content, "로그인한 회원아이디", "현재 컴퓨터 날짜", 0);
	}

	public Board(String title, String content, String writer) {
		this(title, content, writer, "현재 컴퓨터 날짜", 0);
	}

	public Board(String title, String content, String writer, String date) {
		this(title, content, writer, date, 0);
	}

	public Board(String title, String content, String writer, String date, int hitCount) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.hitCount = hitCount;
	}
	
	public void print() {
		System.out.println(title + ", " + content + ", " + writer + ", " + date + ", " + hitCount);
	}
	

}
