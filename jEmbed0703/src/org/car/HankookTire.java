package org.car;

public class HankookTire extends Tire {
	
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	@Override
	public boolean roll() {
		++accmulatedRotation;
		if(accmulatedRotation < maxRotation) {
			System.out.println(location + " HankookTire Life : " + (maxRotation - accmulatedRotation));
			return true;
		} else {
			System.out.println("*** " + location + " HankookTire Punchur ***");
			return false;
		}
	}

}
