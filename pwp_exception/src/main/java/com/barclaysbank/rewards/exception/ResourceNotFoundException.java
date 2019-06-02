package com.barclaysbank.rewards.exception;

public class ResourceNotFoundException extends SystemException{

	private static final long serialVersionUID = 7484448085987096321L;
	private String errorCode;
	private String errorMsg;

	public String getErrorCode() {
		return errorCode;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public ResourceNotFoundException(String errorCode, String errorMsg) {
		super(errorCode, errorMsg);
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}

	

}
