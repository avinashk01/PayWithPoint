package com.barclaysbank.rewards.resource.beans;

public class Resource_BalanceReq {
	private Resource_ServiceDtls svcDtls;
	private Resource_ClientContext clientContext;
	private Resource_CardDetails cardDtls;
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
	public Resource_CardDetails getCardDtls() {
		return cardDtls;
	}
	public void setCardDtls(Resource_CardDetails cardDtls) {
		this.cardDtls = cardDtls;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Resource_BalanceReq [svcDtls=");
		builder.append(svcDtls);
		builder.append(", clientContext=");
		builder.append(clientContext);
		builder.append(", cardDtls=");
		builder.append(cardDtls);
		builder.append("]");
		return builder.toString();
	}
	
			
}
