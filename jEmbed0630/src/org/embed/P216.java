package org.embed;

import java.util.Scanner;

public class P216 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] str_Array = new String[3];
		String[] new_Array = new String[5];
		
		for (int i = 0; i < str_Array.length; i++) {
			System.out.print( (i+1) + "번째 배열의 값 : ");
			str_Array[i] = sc.nextLine();			
		}
		for (int i = 0; i < str_Array.length; i++)
			System.out.println("str_Array[" + i + "] = " + str_Array[i]);
		
		System.arraycopy(str_Array, 0, new_Array, 0, str_Array.length);
		
		System.out.println("str_Array : " + str_Array);
		System.out.println("new_Array : " + new_Array);
		
		for (int i = 0; i < new_Array.length; i++)
			System.out.println("new_Array[" + i + "] = " + new_Array[i]);
		
		

		
	}

}
