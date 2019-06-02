
package com.barclaysbank.rewards.exception;

public class SystemException extends RuntimeException {
	

	private static final long serialVersionUID = 1118998524319235694L;
	private String errorCode;
	private String errorMsg;
	
	public SystemException(String errorCode, String errorMsg) {
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
