package com.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.db.DB;
import com.model.Product;

public class ProductServiceImpl implements ProductService{

	public void addProduct(Product product) {
		String sql = "insert into product(name,price,company,category)values(?,?,?,?)";
		try {
			PreparedStatement ptms = DB.getDb().prepareStatement(sql);
		    ptms.setString(1, product.getName());
		    ptms.setInt(2, product.getPrice());
		    ptms.setString(3, product.getCompany());
		    ptms.setString(4, product.getCategory());
		    
		    ptms.execute();
		    
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	
	public void deleteProduct(int id) {
		String deleteQuery = "DELETE FROM product where id = ?";
		
		try {
			PreparedStatement ptms=DB.getDb().prepareStatement(deleteQuery);
			ptms.setInt(1, id);
			int rowAffected = ptms.executeUpdate();
			if(rowAffected>0) {
				System.out.println("Record with id " + id + " deleted successfully!");
			}
			else {
				System.out.println("Record with id "+id+ "not found! ");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}

	
	public List<Product> getAllProduct() {
		List<Product>productList = new ArrayList<>();
		String query = "SELECT*FROM  product";
				
		try {
		    Statement stm = DB.getDb().createStatement();
			ResultSet resultSet = stm.executeQuery(query);
			while(resultSet.next()) {
				int id = resultSet.getInt("id");
			    String name = resultSet.getString("name");
				String company= resultSet.getString("company");
				int price = resultSet.getInt("price");
			    String category = resultSet.getString("category");
			    System.out.println("id: "+id+"name: "+name+"company: "+company+"price: "+price+"catagory: "+category);
			    Product product = new Product(id, name, company, price, category);
			    productList.add(product);
			 
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return productList;
	}

}
