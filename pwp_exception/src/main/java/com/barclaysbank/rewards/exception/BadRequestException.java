package com.barclaysbank.rewards.exception;

public class BadRequestException extends RuntimeException{
	private static final long serialVersionUID = -4114547606359163753L;
	private String errorCode;
	private String errorMsg;
	public String getErrorCode() {
		return errorCode;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public BadRequestException(String errorCode, String errorMsg) {
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}
	

}
