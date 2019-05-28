package com.barclaysbank.rewards.resource.beans;

import org.springframework.stereotype.Component;

@Component("reso_prod_req")
public class Resource_ProductReq {
	private String productCategoryName;
	private Resource_ServiceDtls svcDtls;
	private Resource_RequestHeader clientContext;
	private Resource_CustomerContext custContext;
	public String getProductCategoryName() {
		return productCategoryName;
	}
	public void setProductCategoryName(String productCategoryName) {
		this.productCategoryName = productCategoryName;
	}
	public Resource_ServiceDtls getSvcDtls() {
		return svcDtls;
	}
	public void setSvcDtls(Resource_ServiceDtls svcDtls) {
		this.svcDtls = svcDtls;
	}
	public Resource_RequestHeader getClientContext() {
		return clientContext;
	}
	public void setClientContext(Resource_RequestHeader clientContext) {
		this.clientContext = clientContext;
	}
	public Resource_CustomerContext getCustContext() {
		return custContext;
	}
	public void setCustContext(Resource_CustomerContext custContext) {
		this.custContext = custContext;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Resource_ProductReq [productCategoryName=");
		builder.append(productCategoryName);
		builder.append(", svcDtls=");
		builder.append(svcDtls);
		builder.append(", clientContext=");
		builder.append(clientContext);
		builder.append(", custContext=");
		builder.append(custContext);
		builder.append("]");
		return builder.toString();
	}
	
}
