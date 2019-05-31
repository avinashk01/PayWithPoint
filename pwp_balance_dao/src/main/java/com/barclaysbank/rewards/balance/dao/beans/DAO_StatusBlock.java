package com.barclaysbank.rewards.balance.dao.beans;

public class DAO_StatusBlock {
	
	private String errorCode;
	
	public DAO_StatusBlock(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode() {
		return errorCode;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DAO_StatusBlock [errorCode=");
		builder.append(errorCode);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	

}
