package org.embed;

public class Hello {

	public static void main(String args[]) {
	
		String i = "10";
		String age = "10";
		
		System.out.println("Hello, World");
		
		System.out.println(Integer.parseInt(i+1));
		System.out.println(Integer.parseInt(i)+1);
		
		System.out.println("UPDATE " + " SET age=" + (Integer.parseInt(age) + 1) + " WHERE name='"  + "'");
		System.out.println("UPDATE " + " SET age=" + (age + 1) + " WHERE name='"  + "'");
	
	}
}