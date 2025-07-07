package org.embed;

public class Singleton {
	
	private Singleton() {
		// TODO Auto-generated constructor stub
	}
	
	private static Singleton sg = new Singleton();
	
	static Singleton getInstance() {
		return sg;
	}

}
