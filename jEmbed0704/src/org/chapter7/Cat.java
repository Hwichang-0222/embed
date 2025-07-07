package org.chapter7;

public class Cat extends Animal {
	
	public Cat() {
		this.kind = "mammal";
	}
	
	@Override
	public void sound() {
		System.out.println("야옹");
	}

}
