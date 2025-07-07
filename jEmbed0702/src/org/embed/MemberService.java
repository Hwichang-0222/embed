package org.embed;

public class MemberService {
	
	String id = "hong";
	String password = "12345";
	
	public boolean LogIn(String id, String password) {
		if (this.id.equals(id) && this.password.equals(password)) {
			return true;
		} else {
			return false;
		}
	}
	
	public void LogOut(String id) {
		System.out.println("Logout.");
	}

}
