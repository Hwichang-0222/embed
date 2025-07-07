package org.embed;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int height;
		int weight;
		
		System.out.print("키(cm)를 입력하세요 : ");
		height = Integer.parseInt(sc.nextLine());
		System.out.print("몸무게(kg)를 입력하세요 : ");
		weight = Integer.parseInt(sc.nextLine());
		
		System.out.printf("입력하신 키는 %1$dcm 이고 몸무게는 %2$dkg 입니다.", height, weight);

	}

}
