package com.barclaysbank.rewards.resource.beans;

public class Resource_CustomerContext {
	private Resource_ServiceDtls svcDtls;
	private Resource_CardDetails cardDtls;
	
	public Resource_CustomerContext() {}
	
	public Resource_ServiceDtls getSvcDtls() {
		return svcDtls;
	}
	public void setSvcDtls(Resource_ServiceDtls svcDtls) {
		this.svcDtls = svcDtls;
	}
	public Resource_CardDetails getCardDtls() {
		return cardDtls;
	}
	public void setCardDtls(Resource_CardDetails cardDtls) {
		this.cardDtls = cardDtls;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Resource_CustomerContext [svcDtls=");
		builder.append(svcDtls);
		builder.append(", cardDtls=");
		builder.append(cardDtls);
		builder.append("]");
		return builder.toString();
	}
		

}
