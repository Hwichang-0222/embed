package org.embed;

public class SingletonRunEx {

	public static void main(String[] args) {

//		Singleton st = new Singleton();  
//		private 접근제한자 (외부 접근 불가)
		
		Singleton st = Singleton.getInstance();
		
	}

}
