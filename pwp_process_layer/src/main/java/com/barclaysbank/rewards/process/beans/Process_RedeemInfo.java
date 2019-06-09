package com.barclaysbank.rewards.process.beans;

import java.util.Date;

public class Process_RedeemInfo {
	private int orderId;
	private Date purchaseDate;
	private Date deliveryDate;
	private String productName;
	private double price;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Process_RedeemInfo [orderId=");
		builder.append(orderId);
		builder.append(", purchaseDate=");
		builder.append(purchaseDate);
		builder.append(", deliveryDate=");
		builder.append(deliveryDate);
		builder.append(", productName=");
		builder.append(productName);
		builder.append(", price=");
		builder.append(price);
		builder.append("]");
		return builder.toString();
	}
	
}
