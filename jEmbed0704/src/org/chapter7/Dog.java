package org.chapter7;

public class Dog extends Animal	{
	
	public Dog() {
		this.kind = "mammal";
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}

}
