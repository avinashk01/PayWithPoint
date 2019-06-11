package com.barclaysbank.rewards.process.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.barclaysbank.rewards.process.Process_Redeem_I;
import com.barclaysbank.rewards.process.beans.Process_RedeemResp;
import com.barclaysbank.rewards.process.builder.Process_RedeemRespBuilder;
import com.barclaysbank.rewards.redeem.dao.bo.DAO_RedeemProductInfo;
import com.barclaysbank.rewards.redeem.dao.impl.DAO_RedeemImpl;

@Service
public class Process_RedeemImpl implements Process_Redeem_I{
	private final static Logger logger = LoggerFactory.getLogger(Process_RedeemImpl.class);
	@Autowired
	DAO_RedeemImpl dao;
	@Autowired
	Process_RedeemRespBuilder respBuilder;
	
	@Override
	public Process_RedeemResp getRedeem(String cardNum) {
		logger.debug("#### Enter into getRedeem() #### cardNum :"+cardNum+" ####");
		List<DAO_RedeemProductInfo> drpInfoList = dao.getRedeemProduct(cardNum);
		//System.out.println(drpInfoList);
		Process_RedeemResp pRedeemRespList = respBuilder.build(drpInfoList);
		//System.out.println(pRedeemRespList);
		logger.info("#### Exit from getBalance()  #### Process_RedeemResp : "+pRedeemRespList+" ####");
		return pRedeemRespList;
	}

	
	
	

}
