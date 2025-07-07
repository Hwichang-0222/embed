package org.chapter09_02_Ex;

public class AnonymousWork {
	
	Worker field = new Worker() {
		@Override
		public void start() {
			System.out.println("Degine");
		}
	};
	
	void method1() {
		Worker localVar = new Worker() {
			@Override
			public void start() {
				System.out.println("Devlope");
			}
		};
		localVar.start();
	}
	
	void method2(Worker worker) {
		worker.start();		
	}

}
