package com.barclaysbank.rewards.resource.beans;

import org.springframework.stereotype.Component;

@Component("reso_prod_info")
public class Resource_ProductInfo {
	private String id;
	private String name;
	private String desc;
	private String price;
	private String expdate;
	private boolean isStock;
	private String vendorName;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getExpdate() {
		return expdate;
	}
	public void setExpdate(String expdate) {
		this.expdate = expdate;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public boolean isStock() {
		return isStock;
	}
	public void setStock(boolean isStock) {
		this.isStock = isStock;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Resource_ProductInfo [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", desc=");
		builder.append(desc);
		builder.append(", expdate=");
		builder.append(expdate);
		builder.append(", price=");
		builder.append(price);
		builder.append(", isStock=");
		builder.append(isStock);
		builder.append(", vendorName=");
		builder.append(vendorName);
		builder.append("]");
		return builder.toString();
	}
	

}
