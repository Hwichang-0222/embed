package org.driver;

public class DriverRunEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver d = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		d.driver(taxi);
		d.driver(bus);

	}

}
