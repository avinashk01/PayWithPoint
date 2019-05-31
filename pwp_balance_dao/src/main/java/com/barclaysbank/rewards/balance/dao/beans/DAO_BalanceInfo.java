package com.barclaysbank.rewards.balance.dao.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="REWARD")
public class DAO_BalanceInfo {
	@Id
	@Column(name="card_num")
	private String cardNum;
	@Column(name="USED_PTS")
	private long usedPts;
	@Column(name="EARN_PTS")
	private long earnedPts;
	@Column(name="PEND_PTS")
	private long pendingPts;
	@Column(name="AVAIL_PTS")
	private long availablePts;
	public String getCardNum() {
		return cardNum;
	}
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}
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
		builder.append("DAO_BalanceInfo [cardNum=");
		builder.append(cardNum);
		builder.append(", usedPts=");
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
