package com.spring.jdbc.bean;

public class ProductDetails {
	private int serialno;
	private String name;
	private String category;
	private float price;
	private float discount;
	public int getSerialno() {
		return serialno;
	}
	public void setSerialno(int serialno) {
		this.serialno = serialno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
}
