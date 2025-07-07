package org.chapter10_01;

public class NullPointExceptionRunEx {

	public static void main(String[] args) {
		
		try {
			String data = null;
			System.out.println(data.toString());
			
		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println("Input String in data");
		} finally {
			System.out.println("Cannot use Null");
		}
		
		
	}

}
