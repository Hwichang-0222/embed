package org.chapter08_2_2;

public class C_impl implements C{

	public static void main(String[] args) {
		C_impl impl = new C_impl();
		
		A a = impl;
		a.methodA();
		
		B b = impl;
		b.methodB();
		
		C c = impl;
		c.methodA();
		c.methodB();
		c.methodC();
		
		
		impl.methodA();
		impl.methodB();
		impl.methodC();

	}
	
	@Override
	public void methodA() {
		System.out.println("C_Impl method A");
	}
	
	@Override
	public void methodB() {
		System.out.println("C_Impl method B");		
	}
	
	@Override
	public void methodC() {
		System.out.println("C_Impl method C");		
	}
	
}
