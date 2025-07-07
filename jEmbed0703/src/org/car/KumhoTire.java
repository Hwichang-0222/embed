package org.car;

public class KumhoTire extends Tire {
	
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	@Override
	public boolean roll() {
		++accmulatedRotation;
		if(accmulatedRotation < maxRotation) {
			System.out.println(location + " KumhoTire Life : " + (maxRotation - accmulatedRotation));
			return true;
		} else {
			System.out.println("*** " + location + " KumhoTire Punchur ***");
			return false;
		}
	}
}
