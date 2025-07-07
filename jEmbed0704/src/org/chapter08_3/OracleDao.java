package org.chapter08_3;

public class OracleDao implements DataAccessObject{
	
	private String name = "Oracle DB";
	
	@Override
	public void delete() {
		System.out.println(name + " delete");
	}
	
	@Override
	public void insert() {
		System.out.println(name + " insert");		
	}
	
	@Override
	public void select() {
		System.out.println(name + " select");		
	}
	
	@Override
	public void update() {
		System.out.println(name + " update");		
	}

}
