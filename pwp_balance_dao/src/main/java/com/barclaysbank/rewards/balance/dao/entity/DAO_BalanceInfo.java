package com.barclaysbank.rewards.balance.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="REWARD")
public class DAO_BalanceInfo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="reward_id")
	private int rewardId;
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
	
	public DAO_BalanceInfo() {}
	
	

	public DAO_BalanceInfo(int rewardId, long usedPts, long earnedPts, long pendingPts, long availablePts) {
		super();
		this.rewardId = rewardId;
		this.usedPts = usedPts;
		this.earnedPts = earnedPts;
		this.pendingPts = pendingPts;
		this.availablePts = availablePts;
	}



	public int getRewardId() {
		return rewardId;
	}

	public void setRewardId(int rewardId) {
		this.rewardId = rewardId;
	}

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
		builder.append("DAO_BalanceInfo [rewardId=");
		builder.append(rewardId);
		builder.append(", cardNum=");
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
