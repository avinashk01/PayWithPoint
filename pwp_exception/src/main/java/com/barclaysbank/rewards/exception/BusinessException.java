
package com.barclaysbank.rewards.exception;

public class BusinessException extends RuntimeException {

	private static final long serialVersionUID = -7964473297462536596L;
	private String errorCode;
	private String errorMsg;
	
	public BusinessException(String errorCode, String errorMsg) {
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
