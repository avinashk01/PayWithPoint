package com.barclaysbank.rewards.balance.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.barclaysbank.rewards.balance.dao.DAO_Balance_I;
import com.barclaysbank.rewards.balance.dao.entity.DAO_BalanceInfo;
import com.barclaysbank.rewards.balance.repository.BalanceJPARepository;
import com.barclaysbank.rewards.exception.ResourceNotFoundException;

@Component
public class DAO_BalanceImpl implements DAO_Balance_I{
	
	@Autowired
	BalanceJPARepository balanceJPARepository;

	@Override
	public DAO_BalanceInfo getBalance(String cardNum){
		DAO_BalanceInfo balanceInfo = balanceJPARepository.findByCardNum(cardNum);
		if(balanceInfo == null) {
			throw new ResourceNotFoundException("101","Resource is not found");
		}
		return balanceInfo;
	}

}












