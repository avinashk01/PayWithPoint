package com.barclaysbank.rewards.product.dao.bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCT")
public class DAO_ProductInfo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PROD_ID")
	private int productId; 
	@Column(name="PROD_NAME")
	private String name;
	@Column(name="PROD_DESC")
	private String description;
	@Column(name="PRICE")
	private double price;
	@Column(name="IS_STOCK")
	private short isStock;
	@Column(name="VENDOR_NAME")
	private String vendorName;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public short getIsStock() {
		return isStock;
	}
	public void setIsStock(short isStock) {
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
		builder.append("DAO_ProductInfo [productId=");
		builder.append(productId);
		builder.append(", name=");
		builder.append(name);
		builder.append(", description=");
		builder.append(description);
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
