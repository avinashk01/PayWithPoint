package com.barclaysbank.rewards.resource.beans;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component("reso_redm_info")
public class Resource_RedeemInfo {
	private String orderId;
	private String productId;
	private Date purchaseDate;
	private String productName;
	private double productPoints;
	private Date exptDeliveryDate;
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPoints() {
		return productPoints;
	}
	public void setProductPoints(double productPoints) {
		this.productPoints = productPoints;
	}
	public Date getExptDeliveryDate() {
		return exptDeliveryDate;
	}
	public void setExptDeliveryDate(Date exptDeliveryDate) {
		this.exptDeliveryDate = exptDeliveryDate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Resource_RedeemInfo [orderId=");
		builder.append(orderId);
		builder.append(", productId=");
		builder.append(productId);
		builder.append(", purchaseDate=");
		builder.append(purchaseDate);
		builder.append(", productName=");
		builder.append(productName);
		builder.append(", productPoints=");
		builder.append(productPoints);
		builder.append(", exptDeliveryDate=");
		builder.append(exptDeliveryDate);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	

}
