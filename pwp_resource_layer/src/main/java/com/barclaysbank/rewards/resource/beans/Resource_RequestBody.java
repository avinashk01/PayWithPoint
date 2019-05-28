package com.barclaysbank.rewards.resource.beans;

public class Resource_RequestBody {
	private Resource_ServiceDtls svcDtls;
	private Resource_CustomerContext custContext;
	public Resource_ServiceDtls getSvcDtls() {
		return svcDtls;
	}
	public void setSvcDtls(Resource_ServiceDtls svcDtls) {
		this.svcDtls = svcDtls;
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
		builder.append("Resource_RequestBody [svcDtls=");
		builder.append(svcDtls);
		builder.append(", custContext=");
		builder.append(custContext);
		builder.append("]");
		return builder.toString();
	}
	

}
