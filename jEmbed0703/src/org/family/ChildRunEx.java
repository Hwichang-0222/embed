package org.family;

public class ChildRunEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parent = new Child();
		
		parent.nation = "Kd";
		parent.method1();
		parent.method2();
		
		
		Child child = (Child) parent;
		child.name = "Le";
		child.method3();
		
		
		
		Parent p2 = new Parent();
		
		if (p2 instanceof Child) {
			Child c2 = (Child) p2;
			System.out.println("Same");
		} else {
			System.out.println("diff");

		}
		

	}

}
