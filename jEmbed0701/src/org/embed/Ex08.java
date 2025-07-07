package org.embed;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		int y;
		int z;
		double avg;
		
		System.out.print("세 개의 정수를 입력하세요 : ");
		x = Integer.parseInt(sc.nextLine());
		y = Integer.parseInt(sc.nextLine());
		z = Integer.parseInt(sc.nextLine());
		avg = (double)(x + y + z) / 3;		
		
		System.out.printf("국어 : %1$d점, 영어 : %2$d점, 수학 : %3$d점 \n", x, y, z);
		System.out.printf("세 과목의 합계는 %1$d점이고 평균은 %2$.4f점 입니다.", x+ y+ z, avg);

	}

}
