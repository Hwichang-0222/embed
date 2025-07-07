package org.embed;

public class ShopServiceEx {

	public static void main(String[] args) {
		
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if (obj1 == obj2) {
			System.out.println("same shopservice object");
		} else {
			System.out.println("different shopservice object");
		}
	}

}
