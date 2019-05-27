package com.barclaysbank.rewards.resource.beans;

import org.springframework.stereotype.Component;

@Component("proc_redm_req")
public class Resource_RedeemReq {
	private Resource_ServiceDtls svcDtls;
	private Resource_ClientContext clientContext;
	private Resource_CustomerContext custContext;
	private Resource_RedeemProductInfo redeemProdInfo;
	
	public Resource_ServiceDtls getSvcDtls() {
		return svcDtls;
	}
	public void setSvcDtls(Resource_ServiceDtls svcDtls) {
		this.svcDtls = svcDtls;
	}
	public Resource_ClientContext getClientContext() {
		return clientContext;
	}
	public void setClientContext(Resource_ClientContext clientContext) {
		this.clientContext = clientContext;
	}
	public Resource_CustomerContext getCustContext() {
		return custContext;
	}
	public void setCustContext(Resource_CustomerContext custContext) {
		this.custContext = custContext;
	}
	public Resource_RedeemProductInfo getRedeemProdInfo() {
		return redeemProdInfo;
	}
	public void setRedeemProdInfo(Resource_RedeemProductInfo redeemProdInfo) {
		this.redeemProdInfo = redeemProdInfo;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Resource_RedeemReq [svcDtls=");
		builder.append(svcDtls);
		builder.append(", clientContext=");
		builder.append(clientContext);
		builder.append(", custContext=");
		builder.append(custContext);
		builder.append(", redeemProdInfo=");
		builder.append(redeemProdInfo);
		builder.append("]");
		return builder.toString();
	}
	
}
