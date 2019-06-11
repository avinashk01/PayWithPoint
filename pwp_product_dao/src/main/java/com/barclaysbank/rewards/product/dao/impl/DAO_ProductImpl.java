package com.barclaysbank.rewards.product.dao.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.barclaysbank.rewards.exception.ResourceNotFoundException;
import com.barclaysbank.rewards.product.dao.DAO_Product_I;
import com.barclaysbank.rewards.product.dao.bo.DAO_ProductInfo;
import com.barclaysbank.rewards.product.repository.ProductJPARepository;

@Repository
public class DAO_ProductImpl implements DAO_Product_I {
	private final static Logger logger = LoggerFactory.getLogger(DAO_ProductImpl.class);
	@Autowired
	ProductJPARepository repository;

	@Override
	public List<DAO_ProductInfo> getProduct(double price) {
		logger.debug("#### Enter into getProduct() #### price :"+" ####");
		List<DAO_ProductInfo>  productInfos = null;
		productInfos= (List<DAO_ProductInfo>) repository.findByPriceLessThan(price);
		  if(productInfos == null) {
			  logger.error("#### Data not found while fetching the data from database ####");
			  throw new ResourceNotFoundException("102","Resource is not found"); 
		  }
		  logger.info("#### Exit from getProduct()  #### List<DAO_ProductInfo> : "+productInfos+" ####");
		return productInfos;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
