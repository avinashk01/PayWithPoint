package com.barclaysbank.rewards.exception;

public class CustomValidationException extends BadRequestException{
	private static final long serialVersionUID = -727925917154332022L;
	private String errorCode;
	private String errorMsg;
	public String getErrorCode() {
		return errorCode;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public CustomValidationException(String errorCode, String errorMsg) {
		super(errorCode,errorMsg);
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}
	

}
