package com.barclaysbank.rewards.process.beans;

import java.util.List;

public class Process_ProductResp {
	private List<Process_ProductInfo> productInfoList;

	public List<Process_ProductInfo> getProductInfoList() {
		return productInfoList;
	}
	public void setProductInfoList(List<Process_ProductInfo> productInfoList) {
		this.productInfoList = productInfoList;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Process_ProductResp [productInfoList=");
		builder.append(productInfoList);
		builder.append("]");
		return builder.toString();
	}
	
	

}
