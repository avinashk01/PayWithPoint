package com.barclaysbank.rewards.redeem.dao.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.barclaysbank.rewards.redeem.dao.DAO_Redeem_I;
import com.barclaysbank.rewards.redeem.dao.bo.DAO_RedeemProductInfo;
import com.barclaysbank.rewards.redeem.repository.RedeemJPARepository;

@Repository
public class DAO_RedeemImpl implements DAO_Redeem_I {
	
	@Autowired
	RedeemJPARepository repository;

	@Override
	public List<DAO_RedeemProductInfo> getProduct(String cardNum) {
		List<DAO_RedeemProductInfo>  redeemProductInfo= repository.findByCardNum(cardNum);
		return redeemProductInfo;
	}

	
	
	
	
	
	
	
	
}
