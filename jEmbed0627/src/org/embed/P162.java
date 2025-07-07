package org.embed;

public class P162 {

	public static void main(String[] args) {
		int n = (int)(Math.random() * 6) + 1;
		
		if (n == 1) {
			System.out.println("1");
		} else if (n == 2) {
			System.out.println("2");
		} else if (n == 3) {
			System.out.println("3");
		} else if (n == 4) {
			System.out.println("4");
		} else if (n == 5) {
			System.out.println("5");
		} else {
			System.out.println("6");
		}

		switch (n) {
		case 1:
			System.out.println("1");			
			break;
		case 2:
			System.out.println("2");			
			break;
		case 3:
			System.out.println("3");			
			break;
		case 4:
			System.out.println("4");			
			break;
		case 5:
			System.out.println("5");			
			break;
		default:
			System.out.println("1");			
		}
		
	}

}
