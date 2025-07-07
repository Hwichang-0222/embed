package org.chapter10_01;

public class Ex {

	public static void main(String[] args) {

		String strArray[] = {"10", "2a"};
		int value = 0;
		
		for (int i = 0; i <= 2; i++) {
			try {
				value = Integer.parseInt(strArray[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Index Over");
			} catch (NumberFormatException e) {
				System.out.println("Cannot change Number");
			} finally {
				System.out.println(value);
			}
			
		}
	}

}
