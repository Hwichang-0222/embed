package org.embed;

public class P180 {

	public static void main(String[] args) {
		
		Esc:for (int i = 0; i < 5; i++) {
			System.out.println("out for() : " + i);
			for (int j = 0; j < 5; j++) {
				if (j == 2)
					break Esc;
				System.out.println("in for() : " + j);
			}
		}

	}

}
