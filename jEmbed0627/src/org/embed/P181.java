package org.embed;

public class P181 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println("out for() : " + i);
			for (int j = 0; j < 5; j++) {
				if (j == 2)
					continue;
				System.out.println("in for() : " + j);
			}
		}

	}

}
