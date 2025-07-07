package org.chapter09_02_Ex;

public class AnonymousVehicle {
	
	Vehicle field = new Vehicle() {
		
		@Override
		public void run() {
			System.out.println("Run Byclie");
			
		}
	};
	
	void method1() {
		Vehicle localVar = new Vehicle() {
			
			@Override
			public void run() {
				System.out.println("Run Car");
				
			}
		};
		localVar.run();
	}
	
	void method2(Vehicle vehicle) {
		vehicle.run();
	}

}
