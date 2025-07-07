package org.chapter09_02;

public class Anonymous {
	
	Person field = new Person() {
		void work() {
			System.out.println("Go to work");
		}
		@Override
		void wake() {
			System.out.println("Wake up at 6");
			work();
		}
	};
	
	void method1() {
		Person localVar = new Person() {
			void walk() {
				System.out.println("walk around");
			}
			
			@Override
			void wake() {
				System.out.println("Wake up at 7:20");
				walk();
			}
		};
		localVar.wake();
	}
	
	void method2(Person person) {
		person.wake();
	}
}
