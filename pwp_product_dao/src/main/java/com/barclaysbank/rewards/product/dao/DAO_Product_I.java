package com.barclaysbank.rewards.product.dao;

import org.springframework.stereotype.Repository;

import com.barclaysbank.rewards.product.dao.beans.DAO_ProductReq;
import com.barclaysbank.rewards.product.dao.beans.DAO_ProductResp;

@Repository("dao_prod_i")
public interface DAO_Product_I {
	DAO_ProductResp getProduct(DAO_ProductReq req);

}
