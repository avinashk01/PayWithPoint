package com.barclaysbank.rewards.process.beans;

import java.util.List;
public class Process_RedeemResp {
	private List<Process_RedeemInfo> redeemInfoList;
	public List<Process_RedeemInfo> getRedeemInfoList() {
		return redeemInfoList;
	}
	public void setRedeemInfoList(List<Process_RedeemInfo> redeemInfoList) {
		this.redeemInfoList = redeemInfoList;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Process_RedeemResp [redeemInfoList=");
		builder.append(redeemInfoList);
		builder.append("]");
		return builder.toString();
	}
	
}
