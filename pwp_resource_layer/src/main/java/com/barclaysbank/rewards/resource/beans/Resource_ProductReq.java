package com.barclaysbank.rewards.resource.beans;

import org.springframework.stereotype.Component;

@Component("reso_prod_req")
public class Resource_ProductReq {
	private String productCategoryName;
	private Resource_ServiceDtls svcDtls;
	private Resource_ClientContext clientContext;
	private Resource_CardDetails custContext;
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
	public Resource_ClientContext getClientContext() {
		return clientContext;
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
	public void setClientContext(Resource_ClientContext clientContext) {
		this.clientContext = clientContext;
	}
	public Resource_CardDetails getCustContext() {
		return custContext;
	}
	public void setCustContext(Resource_CardDetails custContext) {
		this.custContext = custContext;
	}
		
}
