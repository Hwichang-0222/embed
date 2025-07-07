package org.embed;

public class MemberServiceEx {

	public static void main(String[] args) {
		MemberService ms = new MemberService();
		boolean res = ms.LogIn("hong", "12345");
		if (res) {
			System.out.println("Login");
			ms.LogOut("hong");
		} else {
			System.out.println("Login Fail");
		}
	}

}
