package org.car;

public class CarRunEx {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.start();
		
		System.out.println(car.getSpeed());
		System.out.println("-----------------------------------------------");
		
		
		
		for (int i = 0; i < 150; i++) {
			System.out.println(car.getSpeed());
			int problemLocation = car.run();
			
			
			switch (problemLocation) {
			case 1:
				System.out.println("Front Left Change HankookTire");
				car.frontLefrTire = new HankookTire("fLeft", 15);
				break;
			case 2:
				System.out.println("Front Left Change KumhoTire");
				car.frontRightTire = new KumhoTire("fRight", 13);
				break;
			case 3:
				System.out.println("Front Left Change HankookTire");
				car.backLefrTire = new HankookTire("bLeft", 15);
				break;
			case 4:
				System.out.println("Front Left Change KumhoTire");
				car.backRightTire = new KumhoTire("bRight", 12);
				break;
			}
			System.out.println(car.getSpeed());
			System.out.println("-----------------------------------------------");	
		}
	}
}
