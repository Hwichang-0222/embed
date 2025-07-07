package org.embed;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double ampair;
		double registant;
		double volt;
		
		System.out.println("전류값을 입력하세요.");
		ampair = Double.parseDouble(sc.nextLine());
		System.out.println("저항값을 입력하세요");
		registant = Double.parseDouble(sc.nextLine());
		volt = ampair * registant ;
		
		System.out.printf("전류는 %1$.1f암페어 이고 저항은 %2$.1f옴이라면 전압은 %3$.1f볼트입니다.", ampair, registant, volt);

	}

}
	