package com.barclaysbank.rewards.balance.dao.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.barclaysbank.rewards.balance.dao.DAO_Balance_I;
import com.barclaysbank.rewards.balance.dao.entity.DAO_BalanceInfo;
import com.barclaysbank.rewards.balance.repository.BalanceJPARepository;
import com.barclaysbank.rewards.exception.ResourceNotFoundException;

@Component
public class DAO_BalanceImpl implements DAO_Balance_I{
	private final static Logger logger = LoggerFactory.getLogger(DAO_BalanceImpl.class);
	
	@Autowired
	BalanceJPARepository balanceJPARepository;

	@Override
	public DAO_BalanceInfo getBalance(String cardNum){
		logger.debug("#### Enter into getBalance() cardNum "+cardNum+" ####");
		DAO_BalanceInfo balanceInfo = balanceJPARepository.findByCardNum(cardNum);
		if(balanceInfo == null) {
			logger.error("#### Data not found while fetching the data from database ####");
			throw new ResourceNotFoundException("101","Resource is not found");
		}
		logger.info("#### Exit from getBalance()  #### DAO_BalanceInfo : "+balanceInfo+" ####");
		return balanceInfo;
	}

}












