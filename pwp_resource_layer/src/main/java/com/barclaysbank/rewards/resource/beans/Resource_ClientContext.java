package com.barclaysbank.rewards.resource.beans;

public class Resource_ClientContext {
	private String msgTs;
	private String clientId;
	private String channelId;
	private String correlationId;
	
	public Resource_ClientContext() {}
	
	public Resource_ClientContext(String msgTs, String clientId, String channelId, String correlationId) {
		this.msgTs = msgTs;
		this.clientId = clientId;
		this.channelId = channelId;
		this.correlationId = correlationId;
	}
	public String getMsgTs() {
		return msgTs;
	}
	public void setMsgTs(String msgTs) {
		this.msgTs = msgTs;
	}
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getChannelId() {
		return channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	public String getCorrelationId() {
		return correlationId;
	}
	public void setCorrelationId(String correlationId) {
		this.correlationId = correlationId;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Resource_ClientContext [msgTs=");
		builder.append(msgTs);
		builder.append(", clientId=");
		builder.append(clientId);
		builder.append(", channelId=");
		builder.append(channelId);
		builder.append(", correlationId=");
		builder.append(correlationId);
		builder.append("]");
		return builder.toString();
	}
	

}
