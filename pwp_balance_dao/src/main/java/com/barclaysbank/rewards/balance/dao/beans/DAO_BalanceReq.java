package com.barclaysbank.rewards.balance.dao.beans;

public class DAO_BalanceReq {
	private String cardNum;

	public String getCardNum() {
		return cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DAO_BalanceReq [cardNum=");
		builder.append(cardNum);
		builder.append("]");
		return builder.toString();
	}
	

}
