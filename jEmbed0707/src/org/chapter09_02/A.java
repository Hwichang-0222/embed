package org.chapter09_02;

public class A {
	
/*	Parent field = new Child();
	
	void method() {
		Parent localVar = new Child();
	}			*/
	
	Parent field = new Parent() {
		int childField;
		void childMethod() {}
		@Override
		public void parentMethod() {
			// TODO Auto-generated method stub
			super.parentMethod();
		}
	};
	
	
	void method1(Parent parent) {}
	
	void method2() {
		method1(new Parent() {
			int childField;
			void childMethod() {}
			@Override
			public void parentMethod() {
				// TODO Auto-generated method stub
				super.parentMethod();
			}
		});
	}

}
