package java_Practice_02;

public class User {
	
	
	String[] loginInfo;
	boolean usernameVal = true;
	boolean passwordVal = true;
	
	public User(String username, String password) {
		loginInfo = new String[] {username, password};
	}
		
	void usernameCheck(String username) {
		usernameVal = loginInfo[0].equals(username);
	}
	
	void passwordCheck(String password) {
		passwordVal = loginInfo[1].equals(password);
	}
	
	boolean login(String username, String password) {
		return loginInfo[0].equals(username) && loginInfo[1].equals(password);
	}
	
	String getUsername() {
		return loginInfo[0];
	}

}

	
