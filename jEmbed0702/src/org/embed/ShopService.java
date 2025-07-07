package org.embed;

public class ShopService {
	
	private ShopService() {}
	
	private static ShopService ss = new ShopService();
	
	static ShopService getInstance() {
		return ss;
	}

}
