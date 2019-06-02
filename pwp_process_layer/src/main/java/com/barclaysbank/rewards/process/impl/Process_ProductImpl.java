package com.barclaysbank.rewards.process.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barclaysbank.rewards.process.Process_Product_I;
import com.barclaysbank.rewards.process.beans.Process_ProductResp;
import com.barclaysbank.rewards.process.builder.Process_ProductRespBuilder;
import com.barclaysbank.rewards.product.dao.bo.DAO_ProductInfo;
import com.barclaysbank.rewards.product.dao.impl.DAO_ProductImpl;

@Service
public class Process_ProductImpl implements Process_Product_I{
	@Autowired
	DAO_ProductImpl dao;
	@Autowired
	Process_ProductRespBuilder respBuilder;

	@Override
	public Process_ProductResp getProduct(double price) {
		 List<DAO_ProductInfo> daoProductInfo= dao.getProduct(price);
		 Process_ProductResp processProductResp = respBuilder.build(daoProductInfo);
		return processProductResp;
	}

	
	
	
	
	
	
	
	
	
}
