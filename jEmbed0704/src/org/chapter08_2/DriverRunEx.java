package org.chapter08_2;

public class DriverRunEx {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(taxi);
		
		driver.drive(bus);
		
//		Vehicle vehicle;
//		vehicle = new Bus();
		
//		vehicle.run();
//		vehicle.checkFair();  자동 타입 변형으로 인해서 작동 안함
		
///		Bus b1 = (Bus)vehicle; 		// 강제 타입 변형 
//		vehicle이 Bus로 객체선언되어서 가능!
//		b1.checkFair();
		
	}

}
