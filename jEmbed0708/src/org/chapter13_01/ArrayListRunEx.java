package org.chapter13_01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRunEx {
	
	public static void main (String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("myBATIS");
		
		int size = list.size();
		
		System.out.println("Total : " + size);
		System.out.println();
		
		String str = list.get(2);
		System.out.println("2 : " + str);
		System.out.println();
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + " : " + list.get(i));			
		}
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		
		list.remove("myBATIS");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + " : " + list.get(i));			
		}
		
	}

}
