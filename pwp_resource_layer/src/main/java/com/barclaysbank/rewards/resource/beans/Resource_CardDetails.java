
package com.barclaysbank.rewards.resource.beans;

public class Resource_CardDetails {
	private String cardNum;
	private String cvvNum;
	private String expDate;
	private String nameOnCard;
	
	public Resource_CardDetails() {}
	
	public Resource_CardDetails(String cardNum, String cvvNum, String expDate, String nameOnCard) {
		this.cardNum = cardNum;
		this.cvvNum = cvvNum;
		this.expDate = expDate;
		this.nameOnCard = nameOnCard;
	}
	public String getCardNum() {
		return cardNum;
	}
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}
	public String getCvvNum() {
		return cvvNum;
	}
	public void setCvvNum(String cvvNum) {
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
		builder.append("Resource_CardDetails [cardNum=");
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
