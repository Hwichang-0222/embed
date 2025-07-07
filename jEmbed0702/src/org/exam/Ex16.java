package org.exam;

public class Ex16 {
	
	public static void main (String[] args) {
		int sum = 1;
		
		for (int i = 1; i < 11; i = i+2) {
			sum *= i;			
		}
		System.out.println(sum);
	}
}
