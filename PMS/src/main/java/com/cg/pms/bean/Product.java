package com.cg.pms.bean;

public class Product {
	
	private int productId;
	private String productName;
	private double price;
	
	public Product(int productId, String productName, double price)
	{
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}
	public Product()
	{
		super();
	}
	
	public int getProductId()
	{
		 return this.productId;
	}
	public String getProductName()
	{
		return this.productName;
	}
	public double getPrice()
	{
		return this.price;
	}
	public void setProductId(int productId)
	{
		this.productId = productId;
	}
	public void setProductName(String productName)
	{
		this.productName =productName;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
}
