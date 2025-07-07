package org.chapter09_01;

public class ButtonRunEx {

	public static void main(String[] args) {
		
		Button b1 = new Button();
		
		b1.setListener(new CallListener());
		b1.touch();
	
		b1.setListener(new MessageListener());
		b1.touch();
	}
}
