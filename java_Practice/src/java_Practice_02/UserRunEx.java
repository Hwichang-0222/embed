package java_Practice_02;

import java.util.Scanner;

public class UserRunEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		User u1 = new User("홍길동", "abc123");
		User u2 = new User("이순신", "pass432");
		User u3 = new User("장보고", "tiger789");
		
		
		while (count < 3) {
			System.out.print("Input your Username : ");
			String username = sc.nextLine();
			u1.usernameCheck(username);
			u2.usernameCheck(username);
			u3.usernameCheck(username);
		
			if (u1.usernameVal || u2.usernameVal || u3.usernameVal) {
				System.out.print("Input your Passwor : ");
				String password = sc.nextLine();
				u1.passwordCheck(password);
				u2.passwordCheck(password);
				u3.passwordCheck(password);
				if ((u1.usernameVal && u1.passwordVal) || (u2.usernameVal && u2.passwordVal) || (u3.usernameVal && u3.passwordVal)) {
					System.out.println("Loing Success");
					System.out.println("Username : " + username);
					System.out.println("Password : " + password);
					break;
				} else {
					System.out.println("Loing Fail. Wrong Password");
				}
			} else {
				System.out.println("Loing Fail. Wrong Username");
				count++;
			}
		}
		if (count >= 3) {
			System.out.println("3 time Login fail");
		}
		
	}

}
