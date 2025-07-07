package org.embed;

import java.util.Scanner;

public class P168 {

	public static void main(String[] args) throws Exception{
//		1. if, switch
		
//		2.
/*			1) O
			2) O
			3) O
			4) X	*/
		
//		3.
/*		int score = 0;
		System.out.print("Enter your Score : ");
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		System.out.print("Grade is ");
		
		if(score < 70)
			System.out.print("D");
		else if (score < 80)
			System.out.print("C");
		else if (score < 90)
			System.out.print("B");
		else
			System.out.print("A");	*/	
		
//		4.
		System.out.println("Which grade you are (A/B/C/D/E) ? ");
		Scanner sc = new Scanner(System.in);
		String grade = sc.nextLine();
		//int grade = System.in.read();
		
		switch (grade) {
		case "A":
			System.out.println("VVIP");
			break;
		case "B":
			System.out.println("VIP");
			break;
		case "C":
			System.out.println("premium");
			break;
		case "D":
			System.out.println("normal");
			break;
		default:
			System.out.println("nothing");
			break;
		}	
	
	}

}
