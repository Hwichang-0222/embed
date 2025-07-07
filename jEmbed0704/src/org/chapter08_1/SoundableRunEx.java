package org.chapter08_1;

public class SoundableRunEx {

	public static void main(String[] args) {
		
		Soundable sd;
		sd = new Cat();
		System.out.println(sd.sound1());
		sd = new Dog();
		System.out.println(sd.sound1());
		
		printSound(new Cat());
		printSound(new Dog());
	}
	
	public static void printSound(Soundable soundable) {
		System.out.println(soundable);
	}

}
