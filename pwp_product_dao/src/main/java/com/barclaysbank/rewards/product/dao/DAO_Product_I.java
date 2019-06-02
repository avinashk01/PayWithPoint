package com.barclaysbank.rewards.product.dao;

import java.util.List;
import com.barclaysbank.rewards.product.dao.bo.DAO_ProductInfo;

public interface DAO_Product_I {
	List<DAO_ProductInfo> getProduct(double price);

}
