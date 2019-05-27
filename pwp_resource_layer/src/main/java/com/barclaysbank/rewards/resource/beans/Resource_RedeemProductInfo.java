package com.barclaysbank.rewards.resource.beans;

public class Resource_RedeemProductInfo {
	private String productId;
	private String productName;
	private String productType;
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Resource_RedeemProductInfo [productId=");
		builder.append(productId);
		builder.append(", productName=");
		builder.append(productName);
		builder.append(", productType=");
		builder.append(productType);
		builder.append("]");
		return builder.toString();
	}
	
	

}
