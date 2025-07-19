package java_Practice_01;

public class MemberRunEx {

	public static void main(String[] args) {
		
		Member m1 = new Member("Lee", 20, "lee213@gmail.com");
		Member m2 = new Member("Hong", 16, "hong233@gmail.com");
		Member m3 = new Member("Kim", 32, "kim546@gmail.com");
		
		m1.makeArray();
		m2.makeArray();
		m3.makeArray();
		
		for (int i = 0; i < m1.infoArray.length; i++) {
			System.out.print(m1.infoArray[i] + "  ");
			System.out.print(m2.infoArray[i] + "  ");
			System.out.println(m3.infoArray[i]);
						
		}

	}

}
