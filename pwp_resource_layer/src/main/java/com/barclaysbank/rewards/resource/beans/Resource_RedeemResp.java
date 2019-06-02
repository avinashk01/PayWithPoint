package com.barclaysbank.rewards.resource.beans;

import java.util.List;

public class Resource_RedeemResp {
	private Resource_StatusBlock statusBlock;
	private List<Resource_RedeemInfo> redeemInfoList;
	public Resource_StatusBlock getStatusBlock() {
		return statusBlock;
	}
	public void setStatusBlock(Resource_StatusBlock statusBlock) {
		this.statusBlock = statusBlock;
	}
	public List<Resource_RedeemInfo> getRedeemInfoList() {
		return redeemInfoList;
	}
	public void setRedeemInfoList(List<Resource_RedeemInfo> redeemInfoList) {
		this.redeemInfoList = redeemInfoList;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Resource_RedeemResp [statusBlock=");
		builder.append(statusBlock);
		builder.append(", redeemInfoList=");
		builder.append(redeemInfoList);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
