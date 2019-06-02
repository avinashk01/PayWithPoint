package com.barclaysbank.rewards.process.beans;

public class Process_BalanceResp {
	private long usedPts;
	private long earnedPts;
	private long pendingPts;
	private long availablePts;
	
	public long getUsedPts() {
		return usedPts;
	}
	public void setUsedPts(long usedPts) {
		this.usedPts = usedPts;
	}
	public long getEarnedPts() {
		return earnedPts;
	}
	public void setEarnedPts(long earnedPts) {
		this.earnedPts = earnedPts;
	}
	public long getPendingPts() {
		return pendingPts;
	}
	public void setPendingPts(long pendingPts) {
		this.pendingPts = pendingPts;
	}
	public long getAvailablePts() {
		return availablePts;
	}
	public void setAvailablePts(long availablePts) {
		this.availablePts = availablePts;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Process_BalanceResp [usedPts=");
		builder.append(usedPts);
		builder.append(", earnedPts=");
		builder.append(earnedPts);
		builder.append(", pendingPts=");
		builder.append(pendingPts);
		builder.append(", availablePts=");
		builder.append(availablePts);
		builder.append("]");
		return builder.toString();
	}
	
	

}
