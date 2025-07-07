package org.embed;

public class PersonRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person ps = new Person("123456-1234567", "Hong");
		
		System.out.println(ps.name);
		System.out.println(ps.nation);
		System.out.println(ps.ssn);
		
		//ps.nation = "usa";
	}

}
