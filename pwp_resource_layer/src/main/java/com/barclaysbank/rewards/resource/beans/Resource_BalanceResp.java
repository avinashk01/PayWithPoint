package com.barclaysbank.rewards.resource.beans;

import org.springframework.stereotype.Component;

@Component("proc_bal_resp")
public class Resource_BalanceResp {
	private Resource_BalanceInfo balInfo;
	private Resource_StatusBlock statusBlock;
	public Resource_BalanceInfo getBalInfo() {
		return balInfo;
	}
	public void setBalInfo(Resource_BalanceInfo balInfo) {
		this.balInfo = balInfo;
	}
	public Resource_StatusBlock getStatusBlock() {
		return statusBlock;
	}
	public void setStatusBlock(Resource_StatusBlock statusBlock) {
		this.statusBlock = statusBlock;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Resource_BalanceResp [balInfo=");
		builder.append(balInfo);
		builder.append(", statusBlock=");
		builder.append(statusBlock);
		builder.append("]");
		return builder.toString();
	}
	

}
