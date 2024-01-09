package com.view;

import com.model.Product;
import com.service.ProductService;
import com.service.ProductServiceImpl;

public class ProductView {
	public static void main(String[] args) {
		
		//addBtn();
		//deleteBtn();
		listBtn();
	}
	//-----add product-----
	/*static void addBtn() {
		
		ProductService ps = new ProductServiceImpl();
		Product p = new Product();
		p.setName("laptop");
		p.setPrice(3500);
		p.setCompany("Acer");
		p.setCategory("Electronics");
		ps.addProduct(p);
		System.out.println("added success");
		
		
	}*/
	static void deleteBtn() {
		ProductService ps = new ProductServiceImpl();
		//Product p = new Product();
		ps.deleteProduct(1);
		System.out.println("delete success!");
	}
static void listBtn() {
	ProductService ps = new ProductServiceImpl();
	ps.getAllProduct();
	System.out.println("print success!");
}

}
