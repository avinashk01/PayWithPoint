package com.barclaysbank.rewards.resource.beans;

import org.springframework.stereotype.Component;

@Component("proc_redm_resp")
public class Resource_RedeemResp {
	private Resource_RedeemInfo redeemInfo;
	private Resource_StatusBlock statusBlock;
	private Resource_RedeemProductInfo redeemProdInfo;
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
	public Resource_RedeemProductInfo getRedeemProdInfo() {
		return redeemProdInfo;
	}
	public void setRedeemProdInfo(Resource_RedeemProductInfo redeemProdInfo) {
		this.redeemProdInfo = redeemProdInfo;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Resource_RedeemResp [statusBlock=");
		builder.append(statusBlock);
		builder.append(", redeemInfo=");
		builder.append(redeemInfo);
		builder.append(", redeemProdInfo=");
		builder.append(redeemProdInfo);
		builder.append("]");
		return builder.toString();
	}
		

}
