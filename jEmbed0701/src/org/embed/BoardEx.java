package org.embed;

public class BoardEx {

	public static void main(String[] args) {
		
		Board b1 = new Board("title1", "content1");
		Board b2 = new Board("title2", "content2", "writer2");
		Board b3 = new Board("title3", "content3", "writer3", "date3");
		Board b4 = new Board("title4", "content4", "writer4", "date4", 4);

		b1.print();
		b2.print();
		b3.print();
		b4.print();
	}

}
