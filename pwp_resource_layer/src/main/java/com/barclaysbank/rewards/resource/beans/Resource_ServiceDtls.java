package com.barclaysbank.rewards.resource.beans;

public class Resource_ServiceDtls {
	private String svcName;
	private String apiName;
	private String version;
	
	public Resource_ServiceDtls() {}
	
	public Resource_ServiceDtls(String svcName, String apiName, String version) {
		this.svcName = svcName;
		this.apiName = apiName;
		this.version = version;
	}
	public String getSvcName() {
		return svcName;
	}
	public void setSvcName(String svcName) {
		this.svcName = svcName;
	}
	public String getApiName() {
		return apiName;
	}
	public void setApiName(String apiName) {
		this.apiName = apiName;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Resource_ServiceDtls [svcName=");
		builder.append(svcName);
		builder.append(", apiName=");
		builder.append(apiName);
		builder.append(", version=");
		builder.append(version);
		builder.append("]");
		return builder.toString();
	}
	

}
