package org.embed;

import org.hankook.SnowTire;
import org.hyundai.Engine;
import org.kumho.BigWidthTire;

public class Car {
	
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	org.hankook.Tire tire3 = new org.hankook.Tire();
	org.kumho.Tire tire4 = new org.kumho.Tire();
/*	int gas;

	public int getGas() {
		return gas;
	}

	public void setGas(int gas) {
		this.gas = gas;
	}
	
	public boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("No Gas");
			return false;
		}
		System.out.println("Have Gas");
		return true;
	}
	
	public void run() {
		while (true) { 
			if (gas > 0) {
				System.out.println("Run (gas: "+gas+" )");
				gas -= 1;
			} else {
				System.out.println("Stop (gas: "+gas+" )");
				return;
			}
		}
	}
*/

}
