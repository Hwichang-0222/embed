package org.embed;

public class P214 {

	public static void main(String[] args) {
		
		int scores[][] = new int[2][3];
		int scores1[][] = {{10, 20, 30}, {40, 50, 60}};
		
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				scores[i][j] = 10;
				System.out.println("scores[" + i + "][" + j + "] = " + scores[i][j]);
			}
		}
		int total = 0;
		
		System.out.println();
		
		
		for (int i = 0; i < scores1.length; i++) {
			for (int j = 0; j < scores1[i].length; j++) {
				System.out.println("scores1[" + i + "][" + j + "] = " + scores1[i][j]);
				total += scores1[i][j];
			}
		}
		
		System.out.println(total);


	}

}
