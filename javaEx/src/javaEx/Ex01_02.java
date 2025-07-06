package javaEx;

import java.util.Arrays;

public class Ex01_02 {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		int count = 0;
		
		Esc: while (count < 6) {
			lotto[count] = (int)(Math.random()*45) + 1;
			for (int i = 0; i < count; i++) {
				if (lotto[i] == lotto[count]) {
					continue Esc;
				}
			}
			count++;
		}
		
		Arrays.sort(lotto);
		
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
}
