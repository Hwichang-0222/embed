package java_Practice_01;

public class Member {
	
	String name;
	int age;
	String e_mail;
	String info;
	String infoArray[];
		
	public Member(String name, int age, String e_mail) {
		this.name = name;
		this.age = age;
		this.e_mail = e_mail;
	}
	
	void getInfo() {
		if (age >= 20) {
			info = "adult";
		} else {
			info = "청소년";
		}
	}
	
	void makeArray() {
		getInfo();
		infoArray = new String[] {name, String.valueOf(age), e_mail, info};
		
	}

}
