package org.exam;

public class Ex15 {
	
	public static void main (String[] args) {
		int sum = 1;
		
		for (int i = 2; i < 11; i = i+2) {
			sum *= i;			
		}
		System.out.println(sum);
	}
}
