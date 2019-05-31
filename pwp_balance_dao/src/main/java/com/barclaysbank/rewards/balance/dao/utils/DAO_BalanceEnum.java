package com.barclaysbank.rewards.balance.dao.utils;

public enum DAO_BalanceEnum {
	
	pwp001("pwp001","Unable to Process the request","101","Invalid ClientId"),
	pwp002("pwp002","Unable to Process the request","102","Invalid ChannelId"),
	pwp003("pwp003","Enter Valid Card number","103","Invalid CardNumber "),
	pwp004("pwp004","Enter Valid CVV number","104","Invalid CVV number"),
	pwp005("pwp005","Enter Valid ExpDate","105","Invalid ExpDate"),
	pwp006("pwp006","Invalid Request","106","Resource Not Found");
	
	private String respCode;
	private String respMsg;
	private String erroCode;
	private String errorMsg;
	
	private DAO_BalanceEnum(String respCode, String respMsg, String erroCode, String errorMsg) {
		this.respCode = respCode;
		this.respMsg = respMsg;
		this.erroCode = erroCode;
		this.errorMsg = errorMsg;
	}
	public static String getRespCode(String errorCode) {
		String respCode = null;
		DAO_BalanceEnum [] enms = DAO_BalanceEnum.values();
		for(DAO_BalanceEnum enm : enms) {
			if(enm.erroCode.equals(errorCode)) {
				respCode =  enm.respCode;
			}
		}
		return respCode;
	}
	public static String getRespMsg(String errorCode) {
		String respMsg = null;
		DAO_BalanceEnum [] enms = DAO_BalanceEnum.values();
		for(DAO_BalanceEnum enm : enms) {
			if(enm.erroCode.equals(errorCode)) {
				respMsg =  enm.respMsg;
			}
		}
		return respMsg;
	}
	public String getErrorMsg(String errorCode) {
		String errorMsg = null;
		DAO_BalanceEnum [] enms = DAO_BalanceEnum.values();
		for(DAO_BalanceEnum enm : enms) {
			if(enm.erroCode.equals(errorCode)) {
				errorMsg =  enm.errorMsg;
			}
		}
		return errorMsg;
	}
}
