package org.embed;

public class CarEx {
	
	static int num;
	
	int speed;
	
	void run() {
		System.out.println(speed + "km/h");
	}


	
	public static void main(String[] args) {
		
		CarEx car = new CarEx();
		System.out.println(car.speed);
		car.run();
		
		CarEx.num = 15;
		
/*		Car c1 = new Car();
		
		c1.setGas(5);
		
		boolean gasState = c1.isLeftGas();
		
		if (gasState) {
			System.out.println("Strat");
			c1.run();
		}
		
		if (c1.isLeftGas()) {
			System.out.println("keep Going");
		} else {
			System.out.println("Charge Gas");
		}
		*/
		

	}

}
