package java_Practice_04;

import java.util.ArrayList;
import java.util.List;

public class School {
	
	private List<Student> students;
	
	public School() {
		students = new ArrayList<Student>();
	}
	
	public void addStudent(Student student) {
		students.add(student);
		System.out.println("Student is added : " + student.getStudent_Name());
	}
	
	public Student printStudent(String name) {
		for (Student student : students) {
			if (name.equals(student.getStudent_Name())) {
				return student;
			}
		}
		return null;
	}
	
	public void printAllAverages() {
		if (students.isEmpty()) {
			System.out.println("No Student");
		} else {
			for (Student student : students) {
				System.out.println(student.getStudent_Name() + " is average score : " + student.getAverageScore());
			}
		}
	}
	

}
