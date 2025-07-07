package org.embed;

public class Student extends People{
	
	public int student_num;
	
	public Student(String name, String ssn, int student_num) {
		super(name, ssn);
		this.student_num = student_num;
	}

}
