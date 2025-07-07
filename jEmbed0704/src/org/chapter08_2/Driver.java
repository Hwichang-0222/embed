package org.chapter08_2;

public class Driver {
	
	public void drive(Vehicle vehicle) {
		
		if (vehicle instanceof Bus) {
			System.out.println("same");
		}
		
		vehicle.run();
	}

}
