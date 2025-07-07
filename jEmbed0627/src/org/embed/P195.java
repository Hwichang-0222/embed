package org.embed;

public class P195 {

	public static void main(String[] args) {
		
		String strVar1 = "gildong";
		String strVar2 = "Java";
		
		String strVar3 = new String("gildong");
		String strVar4 = new String("gildong");
		
		
		if (strVar1 == strVar2) {
			System.out.println("same");
		} else {
			System.out.println("not same");
		}
		
		if (strVar1.equals(strVar2)) {
			System.out.println("same");
		} else {
			System.out.println("not same");
		}
		
		if (strVar3 == strVar4) {
			System.out.println("same");
		} else {
			System.out.println("not same");
		}
		
		if (strVar3.equals(strVar4)) {
			System.out.println("same");
		} else {
			System.out.println("not same");
		}

	}

}
