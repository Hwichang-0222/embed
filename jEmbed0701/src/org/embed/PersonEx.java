package org.embed;

public class PersonEx {

	public static void main(String[] args) {
		Person p1 = new Person();
		Car c1 = new Car();
		
		System.out.println(c1.speed);
		
		c1.method();
		System.out.println(c1.speed);
		
		c1.speed = p1.methodPs();
		System.out.println(c1.speed);
	}

}
