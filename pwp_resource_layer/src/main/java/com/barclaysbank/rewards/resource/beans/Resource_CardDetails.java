
package com.barclaysbank.rewards.resource.beans;

public class Resource_CardDetails {
	private int cvvNum;
	private String expDate;
	private String nameOnCard;
	
	public int getCvvNum() {
		return cvvNum;
	}
	public void setCvvNum(int cvvNum) {
		this.cvvNum = cvvNum;
	}
	public String getExpDate() {
		return expDate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Resource_CustomerContext [cvvNum=");
		builder.append(cvvNum);
		builder.append(", expDate=");
		builder.append(expDate);
		builder.append(", nameOnCard=");
		builder.append(nameOnCard);
		builder.append("]");
		return builder.toString();
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
	
	
	

}
