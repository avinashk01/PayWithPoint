package com.barclaysbank.rewards.resource.beans;

import org.springframework.stereotype.Component;

@Component("proc_redm_resp")
public class Resource_RedeemResp {
	private Resource_StatusBlock statusBlock;
	private Resource_RedeemInfo redeemInfo;
	public Resource_StatusBlock getStatusBlock() {
		return statusBlock;
	}
	public void setStatusBlock(Resource_StatusBlock statusBlock) {
		this.statusBlock = statusBlock;
	}
	public Resource_RedeemInfo getRedeemInfo() {
		return redeemInfo;
	}
	public void setRedeemInfo(Resource_RedeemInfo redeemInfo) {
		this.redeemInfo = redeemInfo;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Resource_RedeemResp [statusBlock=");
		builder.append(statusBlock);
		builder.append(", redeemInfo=");
		builder.append(redeemInfo);
		builder.append("]");
		return builder.toString();
	}
	

}
