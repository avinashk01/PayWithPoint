
package com.barclaysbank.rewards.resource.beans;

public class Resource_CustomerContext {
	private int cvvNum;
	private String expDate;
	private String cardNum;
	private String nameOnCard;
	
	public String getCardNum() {
		return cardNum;
	}
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}
	public int getCvvNum() {
		return cvvNum;
	}
	public void setCvvNum(int cvvNum) {
		this.cvvNum = cvvNum;
	}
	public String getExpDate() {
		return expDate;
	}
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	public String getNameOnCard() {
		return nameOnCard;
	}
	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Resource_CustomerContext [cardNum=");
		builder.append(cardNum);
		builder.append(", cvvNum=");
		builder.append(cvvNum);
		builder.append(", expDate=");
		builder.append(expDate);
		builder.append(", nameOnCard=");
		builder.append(nameOnCard);
		builder.append("]");
		return builder.toString();
	}
	
	

}
