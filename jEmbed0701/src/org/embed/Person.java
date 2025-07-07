package org.embed;

public class Person {
	
	int methodPs() {
		Car myCar = new Car("그랜저", "흰색");
		
		myCar.speed = 60;
		return myCar.speed;
	}

}
