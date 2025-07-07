package org.embed;

public class ComputerRunEx {

	public static void main(String[] args) {
		
		Computer pc = new Computer();
		
		int[] values = {10, 20, 30};
		
		int res = pc.sum1(values);
		System.out.println(res);
		
		int res1 = pc.sum2(values);
		System.out.println(res1);
	}

}
