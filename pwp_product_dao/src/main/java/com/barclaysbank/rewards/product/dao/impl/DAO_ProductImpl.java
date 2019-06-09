package com.barclaysbank.rewards.product.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.barclaysbank.rewards.product.dao.DAO_Product_I;
import com.barclaysbank.rewards.product.dao.bo.DAO_ProductInfo;
import com.barclaysbank.rewards.product.repository.ProductJPARepository;

@Repository
public class DAO_ProductImpl implements DAO_Product_I {
	
	@Autowired
	ProductJPARepository repository;

	@Override
	public List<DAO_ProductInfo> getProduct(double price) {
		List<DAO_ProductInfo>  productInfos = null;
		productInfos= (List<DAO_ProductInfo>) repository.findByPriceLessThan(price);
		/*
		 * if(productInfos == null) { throw new
		 * ResourceNotFoundException("102","Resource is not found"); }
		 */
		return productInfos;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
