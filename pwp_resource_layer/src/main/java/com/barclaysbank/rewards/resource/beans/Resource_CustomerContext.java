package com.barclaysbank.rewards.resource.beans;

public class Resource_CustomerContext {
	private Resource_ServiceDtls svcDtls;
	private Resource_CardDetails custContext;
	public Resource_ServiceDtls getSvcDtls() {
		return svcDtls;
	}
	public void setSvcDtls(Resource_ServiceDtls svcDtls) {
		this.svcDtls = svcDtls;
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
		builder.append("Resource_RequestBody [svcDtls=");
		builder.append(svcDtls);
		builder.append(", custContext=");
		builder.append(custContext);
		builder.append("]");
		return builder.toString();
	}
	

}
