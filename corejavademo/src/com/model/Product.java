package com.model;

public class Product {

	private  int id;
	private String name;
	private String company;
	private int price;
	private String category;
	
	public Product(int id, String name, String company, int price, String category) {
		this.id=id;
		this.name=name;
		this.company=company;
		this.price=price;
		this.category=category;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
}
