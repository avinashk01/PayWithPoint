
package com.barclaysbank.rewards.exception;

public class UnknownException extends RuntimeException {

	private static final long serialVersionUID = 5134837429148765327L;
	
	private String errorCode;
	private String errorMsg;
	
	public UnknownException(String errorCode, String errorMsg) {
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}

	public String getErrorCode() {
		return errorCode;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	
}
