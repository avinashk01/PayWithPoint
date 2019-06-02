package com.barclaysbank.rewards.resource.beans;

import java.util.List;

public class Resource_ProductResp {
	private Resource_StatusBlock statusBlock;
	private List<Resource_ProductInfo> productList;
	public Resource_StatusBlock getStatusBlock() {
		return statusBlock;
	}
	public void setStatusBlock(Resource_StatusBlock statusBlock) {
		this.statusBlock = statusBlock;
	}
	public List<Resource_ProductInfo> getProductList() {
		return productList;
	}
	public void setProductList(List<Resource_ProductInfo> productList) {
		this.productList = productList;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Resource_ProductResp [statusBlock=");
		builder.append(statusBlock);
		builder.append(", productList=");
		builder.append(productList);
		builder.append("]");
		return builder.toString();
	}

}
