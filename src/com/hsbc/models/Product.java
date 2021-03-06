package com.hsbc.models;

import java.sql.Time;

public class Product {

	private int productId;
	private int productName;
	private double productPrice;
	private int productCategoryId;
	private Time createdAt;
	private Time updatedAt;
	/**
	 * @return the productId
	 */
	public int getProductId() {
		return productId;
	}
	/**
	 * @param productId the productId to set
	 */
	public void setProductId(int productId) {
		this.productId = productId;
	}
	/**
	 * @return the productName
	 */
	public int getProductName() {
		return productName;
	}
	/**
	 * @param productName the productName to set
	 */
	public void setProductName(int productName) {
		this.productName = productName;
	}
	/**
	 * @return the productPrice
	 */
	public double getProductPrice() {
		return productPrice;
	}
	/**
	 * @param productPrice the productPrice to set
	 */
	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}
	/**
	 * @return the productCategoryId
	 */
	public int getProductCategoryId() {
		return productCategoryId;
	}
	/**
	 * @param productCategoryId the productCategoryId to set
	 */
	public void setProductCategoryId(int productCategoryId) {
		this.productCategoryId = productCategoryId;
	}
	/**
	 * @return the createdAt
	 */
	public Time getCreatedAt() {
		return createdAt;
	}
	/**
	 * @param createdAt the createdAt to set
	 */
	public void setCreatedAt(Time createdAt) {
		this.createdAt = createdAt;
	}
	/**
	 * @return the updatedAt
	 */
	public Time getUpdatedAt() {
		return updatedAt;
	}
	/**
	 * @param updatedAt the updatedAt to set
	 */
	public void setUpdatedAt(Time updatedAt) {
		this.updatedAt = updatedAt;
	}
	/**
	 * @param productId
	 * @param productName
	 * @param productPrice
	 * @param productCategoryId
	 * @param createdAt
	 * @param updatedAt
	 */
	public Product(int productId, int productName, float productPrice, int productCategoryId, Time createdAt,
			Time updatedAt) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productCategoryId = productCategoryId;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	/**
	 * 
	 */
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
