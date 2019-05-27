package com.barclaysbank.rewards.resource.beans;

import org.springframework.stereotype.Component;

@Component("proc_bal_info")
public class Resource_BalanceInfo {
	private long availablePts;
	private long earnedPts;
	private long usedPts;
	private long pendingPts;
	public long getAvailablePts() {
		return availablePts;
	}
	public void setAvailablePts(long availablePts) {
		this.availablePts = availablePts;
	}
	public long getEarnedPts() {
		return earnedPts;
	}
	public void setEarnedPts(long earnedPts) {
		this.earnedPts = earnedPts;
	}
	public long getUsedPts() {
		return usedPts;
	}
	public void setUsedPts(long usedPts) {
		this.usedPts = usedPts;
	}
	public long getPendingPts() {
		return pendingPts;
	}
	public void setPendingPts(long pendingPts) {
		this.pendingPts = pendingPts;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Resource_BalanceInfo [availablePts=");
		builder.append(availablePts);
		builder.append(", earnedPts=");
		builder.append(earnedPts);
		builder.append(", usedPts=");
		builder.append(usedPts);
		builder.append(", pendingPts=");
		builder.append(pendingPts);
		builder.append("]");
		return builder.toString();
	}
	

}
