package org.embed;

public class Computer extends Calculator{
	@Override
	double areaCricle(double r) {
		// TODO Auto-generated method stub
		System.out.println("Computer area()");
		return Math.PI * r * r;
	}
}
