package org.chapter08_1;

public class Cat extends Animal implements Soundable {
	
	public Cat() {
		this.kind = "mammal";
		System.out.println("야옹1");
	}
	
	@Override
	public void sound() {
		System.out.println("야옹");
	}
	
	@Override
	public String sound1() {
		return "야옹";
	}

}
