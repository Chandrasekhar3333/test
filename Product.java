package com.springboot.productdata;

import org.springframework.stereotype.Component;

@Component
public class Product {
	
	public Product() {
		
	}
	public Product(int productId, String productName, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	private int productId;
	private String  productName;
	private double productPrice;
	
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public int getProductId() {
		return productId;
	}
	public String getProductName() {
		return productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	@Override
	public String toString() {
		return "Products [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
	
}
