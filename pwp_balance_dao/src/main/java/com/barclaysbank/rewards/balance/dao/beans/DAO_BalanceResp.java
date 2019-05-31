package com.barclaysbank.rewards.balance.dao.beans;

public class DAO_BalanceResp {
	private DAO_BalanceInfo balanceInfo;
	private DAO_StatusBlock statusBlock;
	public DAO_BalanceInfo getBalanceInfo() {
		return balanceInfo;
	}
	public void setBalanceInfo(DAO_BalanceInfo balanceInfo) {
		this.balanceInfo = balanceInfo;
	}
	public DAO_StatusBlock getStatusBlock() {
		return statusBlock;
	}
	public void setStatusBlock(DAO_StatusBlock statusBlock) {
		this.statusBlock = statusBlock;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DAO_BalanceResp [balanceInfo=");
		builder.append(balanceInfo);
		builder.append(", statusBlock=");
		builder.append(statusBlock);
		builder.append("]");
		return builder.toString();
	}
	
	

}
