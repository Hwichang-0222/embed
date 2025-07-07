package org.chapter09_02_Ex;

public class AnonymousVehicleRunEx {

	public static void main(String[] args) {
		
		AnonymousVehicle anony = new AnonymousVehicle();
		
		anony.field.run();
		
		anony.method1();
		
		anony.method2(new Vehicle() {
			
			@Override
			public void run() {
				System.out.println("Run Truck");
				
			}
		});
		
	}

}
