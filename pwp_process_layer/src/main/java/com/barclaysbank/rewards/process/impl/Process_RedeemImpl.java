package com.barclaysbank.rewards.process.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.barclaysbank.rewards.process.Process_Redeem_I;
import com.barclaysbank.rewards.process.beans.Process_RedeemResp;
import com.barclaysbank.rewards.process.builder.Process_RedeemRespBuilder;
import com.barclaysbank.rewards.redeem.dao.bo.DAO_RedeemProductInfo;
import com.barclaysbank.rewards.redeem.dao.impl.DAO_RedeemImpl;

@Service
public class Process_RedeemImpl implements Process_Redeem_I{
	@Autowired
	DAO_RedeemImpl dao;
	@Autowired
	Process_RedeemRespBuilder respBuilder;
	
	@Override
	public Process_RedeemResp getRedeem(String cardNum) {
		List<DAO_RedeemProductInfo> drpInfoList = dao.getProduct(cardNum);
		Process_RedeemResp pRedeemRespList = respBuilder.build(drpInfoList);
		return pRedeemRespList;
	}

	
	
	

}
