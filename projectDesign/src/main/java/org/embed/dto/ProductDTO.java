package org.embed.dto;

public class ProductDTO {
	
	private int num;
	private String name;
	private int price;
	private int amount;
	
	public ProductDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public ProductDTO(int num, String name, int price, int amount) {
		this.num = num;
		this.name = name;
		this.price = price;
		this.amount = amount;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}
