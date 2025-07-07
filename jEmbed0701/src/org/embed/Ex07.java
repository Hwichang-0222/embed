package org.embed;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		int y;
		int z;
		
		System.out.print("세 개의 정수를 입력하세요 : ");
		x = Integer.parseInt(sc.nextLine());
		y = Integer.parseInt(sc.nextLine());
		z = Integer.parseInt(sc.nextLine());
				
		System.out.printf("정수 %1$d,%2$d,%3$d의 곱은 %4$d입니다.", x, y, z, x*y*z);

	}

}
