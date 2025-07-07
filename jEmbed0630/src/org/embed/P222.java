package org.embed;

import java.util.Scanner;

public class P222 {

	public static void main(String[] args) {

//		1.		2
		
//		2.		3
		
//		3.
/*		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		System.out.println(array.length);		//array.length = 3
		System.out.println(array[2].length);	*///array[2].length = 5
		
//		4.
/*		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		
		for (int i = 0; i < array.length; i++) {
			if (max <= array[i])
				max = array[i];
		}
		
		System.out.println("max : " + max);	*/
		
//		5.
/*		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		int count = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				count++;
			}
		}
		avg = (double)sum / count;
		
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);		*/
		
//		6.
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int student_Num = 0;
		int[] scores = null;
		
		while (run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------");
			System.out.print("선택 > ");
								
			int select_Num = sc.nextInt();
			
			switch (select_Num) {
			case 1:
				System.out.print("학생수 > ");
				student_Num = sc.nextInt();
				scores = new int[student_Num];
				break;
				
			case 2:
				if (scores != null) {
					for (int i = 0; i < scores.length; i++) {
						System.out.print("scores[" + i + "] > ");
						scores[i] = sc.nextInt();
					}
				} else {
					System.out.println("학생 수가 확인되지 않습니다. 다시 선택하세요");
					break;
				}
				break;
				
			case 3:
				for (int i = 0; i < scores.length; i++) 
					System.out.println("scores[" + i + "] > " + scores[i]);
				break;
				
			case 4:
				int sum = 0;
				int max = 0;
				double avg = 0.0;
				
				for (int i = 0; i < scores.length; i++) {
					if (max < scores[i])
						max = scores[i];
					sum += scores[i];
				}
				avg = (double)sum / student_Num;
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + avg);
				break;
				
			case 5:
				run = false;
				break;
			
			default:
				System.out.println("다시 선택하세요");
				continue;
			}	
/*			if (select_Num == 1) {
			System.out.print("학생수 > ");
			student_Num = Integer.parseInt(sc.nextLine());
			scores = new int[student_Num];
			
		} else if (select_Num == 2) {
			for (int i = 0; i < scores.length; i++) {
				System.out.print("scores[" + i + "] > ");
				scores[i] = Integer.parseInt(sc.nextLine());
			}
			
		} else if (select_Num == 3) {
			for (int i = 0; i < scores.length; i++) 
				System.out.println("scores[" + i + "] > " + scores[i]);
			
		} else if (select_Num == 4) {
			int sum = 0;
			int max = 0;
			double avg = 0.0;
			int count = 0;
			
			for (int i = 0; i < scores.length; i++) {
				if (max < scores[i])
					max = scores[i];
				sum += scores[i];
				count++;
			}
			avg = (double)sum / scores.length;
			System.out.println("최고 점수 : " + max);
			System.out.println("평균 점수 : " + avg);
			
		} else if (select_Num == 5) {
			run = false;
		} else {
			System.out.println("다시 선택하세요");
			continue;
		}	*/			
			
		}
		System.out.println("프로그램 종료");
	
	}

}
