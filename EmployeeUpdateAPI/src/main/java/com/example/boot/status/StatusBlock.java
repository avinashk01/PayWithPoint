package com.example.boot.status;

public class StatusBlock {
	private String repsCode;
	private String respMsg;
	private String clientId;
	private String channelId;
	
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
	public String getRepsCode() {
		return repsCode;
	}
	public void setRepsCode(String repsCode) {
		this.repsCode = repsCode;
	}
	public String getRespMsg() {
		return respMsg;
	}
	public void setRespMsg(String respMsg) {
		this.respMsg = respMsg;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StatusBlock [clientId=");
		builder.append(clientId);
		builder.append(", channelId=");
		builder.append(channelId);
		builder.append(", repsCode=");
		builder.append(repsCode);
		builder.append(", respMsg=");
		builder.append(respMsg);
		builder.append("]");
		return builder.toString();
	}
	

}
