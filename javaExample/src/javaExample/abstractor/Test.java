package javaExample.abstractor;

public class Test {
	public static void main (String args[]) {
		Animal a = new Chicken();
		a.show();
	}
}

abstract class Animal {
	
	String a = "is animal";
	abstract void look();
	void show() { 
		System.out.println("zoo");
	}
}

class Chicken extends Animal {
	
	public Chicken() {
		// TODO Auto-generated constructor stub
		look();
	}
	
	void look() {
		System.out.println("chicken " + a);
	}
	
	void display() {
		System.out.println("two wings");
	}
}