package org.exam;

import java.util.Scanner;

public class Ex06_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int qus = (int)(Math.random() * 100) + 1;
		int ans = 0;
		
		System.out.println("=====================================");
		System.out.println("======= Number Up & Down Game =======");
		System.out.println("=====================================");
		
		while (ans != qus) {
			System.out.print("Enter a Number between 1 to 100 >> ");
			ans = Integer.parseInt(sc.nextLine());
			
			System.out.println("You entered " + ans);
            System.out.println(
            		qus == ans ? "It's correct! Congratulations!" :
            		qus > ans ? "Answer is low. Put hirer" : "Answer is high. Put lower");
		}
	}


}
