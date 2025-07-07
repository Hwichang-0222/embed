package org.embed;

public class Child extends Parent{
	public String name;
	
	public Child() {
		this("Hong");
		System.out.println("Child() call");
	}
	
	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
