package org.embed;

public class StudentRunEx {

	public static void main(String[] args) {
		Student st = new Student("Hong", "123456-1234567", 1);
		
		System.out.println(st.student_num);
		System.out.println(st.getName());
		System.out.println(st.getSsn());
	}

}
