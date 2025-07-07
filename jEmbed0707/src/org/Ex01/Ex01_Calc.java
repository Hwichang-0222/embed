package org.Ex01;

public class Ex01_Calc {
	
	private int total = 0;
	
	public void avg(int total, int length) {
		double avg = (double)total / length;
		System.out.println("Average : " + avg);
	}
	
	public void total(int[] input) {
				
		for (int i = 0; i < input.length; i++) {
			 total += input[i];			
		}
		System.out.println("Total : " + total);
	}
	
	public int getTotal() {
		return total;
	}

}
