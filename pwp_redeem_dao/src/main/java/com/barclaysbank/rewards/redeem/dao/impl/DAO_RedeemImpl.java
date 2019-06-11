package com.barclaysbank.rewards.redeem.dao.impl;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.barclaysbank.rewards.exception.ResourceNotFoundException;
import com.barclaysbank.rewards.redeem.dao.DAO_Redeem_I;
import com.barclaysbank.rewards.redeem.dao.bo.DAO_RedeemProductInfo;
import com.barclaysbank.rewards.redeem.repository.RedeemJPARepository;

@Repository
public class DAO_RedeemImpl implements DAO_Redeem_I {
	private final static Logger logger = LoggerFactory.getLogger(DAO_RedeemImpl.class);
	@Autowired
	RedeemJPARepository repository;

	@Override
	public List<DAO_RedeemProductInfo> getRedeemProduct(String cardNum) {
		logger.debug("#### Enter into getRedeemProduct() #### cardNum "+cardNum+" ####");
		List<DAO_RedeemProductInfo>  redeemProductInfo= repository.findByCardNum(cardNum);
		if(redeemProductInfo == null) {
			logger.error("#### Data not found while fetching the data from database ####");
			throw new ResourceNotFoundException("119", "Resource is not found");
		}
		logger.info("#### Exit from getRedeemProduct()  #### List<DAO_RedeemProductInfo> : "+redeemProductInfo+" ####");
		return redeemProductInfo;
	}

	
	
	
	
	
	
	
	
}
