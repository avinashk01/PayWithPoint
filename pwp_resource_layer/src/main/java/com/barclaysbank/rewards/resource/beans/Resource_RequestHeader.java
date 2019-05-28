package com.barclaysbank.rewards.resource.beans;

public class Resource_RequestHeader {
	private String msgTs;
	private String clientId;
	private String channelId;
	private String correlationId;
	
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
	public String getMsgTs() {
		return msgTs;
	}
	public void setMsgTs(String msgTs) {
		this.msgTs = msgTs;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Resource_ClientContext [clientId=");
		builder.append(clientId);
		builder.append(", channelId=");
		builder.append(channelId);
		builder.append(", correlationId=");
		builder.append(correlationId);
		builder.append(", msgTs=");
		builder.append(msgTs);
		builder.append("]");
		return builder.toString();
	}
	

}
