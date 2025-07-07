package org.chapter08_1;

public class Dog extends Animal implements Soundable {
	
	public Dog() {
		this.kind = "mammal";
		System.out.println("멍멍1");
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
	
	@Override
	public String sound1() {
		return "멍멍";
	}
}
