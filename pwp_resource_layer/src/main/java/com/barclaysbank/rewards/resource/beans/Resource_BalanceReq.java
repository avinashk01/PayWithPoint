package com.barclaysbank.rewards.resource.beans;

import org.springframework.stereotype.Component;

@Component("reso_bal_req")
public class Resource_BalanceReq {
	private Resource_ServiceDtls svcDtls;
	private Resource_ClientContext clientContext;
	private Resource_CardDetails custContext;
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
	public Resource_CardDetails getCustContext() {
		return custContext;
	}
	public void setCustContext(Resource_CardDetails custContext) {
		this.custContext = custContext;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Resource_BalanceReq [svcDtls=");
		builder.append(svcDtls);
		builder.append(", clientContext=");
		builder.append(clientContext);
		builder.append(", custContext=");
		builder.append(custContext);
		builder.append("]");
		return builder.toString();
	}
	
	
			
}
