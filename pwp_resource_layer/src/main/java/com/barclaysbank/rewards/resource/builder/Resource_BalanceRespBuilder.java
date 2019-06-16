package com.barclaysbank.rewards.resource.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.barclaysbank.rewards.process.beans.Process_BalanceResp;
import com.barclaysbank.rewards.resource.beans.Resource_BalanceInfo;
import com.barclaysbank.rewards.resource.beans.Resource_BalanceResp;

@Component
public class Resource_BalanceRespBuilder {
	private final static Logger logger = LoggerFactory.getLogger(Resource_BalanceRespBuilder.class);
	public Resource_BalanceResp build(Process_BalanceResp pbResp) {
		logger.debug("#### Enter into ResourceBalanceRespBuilder ####");
		
		Resource_BalanceResp rbResp = new Resource_BalanceResp();
		Resource_BalanceInfo balInfo = new Resource_BalanceInfo();		
		//BeanUtils.copyProperties(pbResp, balInfo);
		balInfo.setAvailablePts(pbResp.getAvailablePts());
		balInfo.setEarnedPts(pbResp.getEarnedPts());
		balInfo.setPendingPts(pbResp.getPendingPts());
		balInfo.setUsedPts(pbResp.getUsedPts());
		rbResp.setBalInfo(balInfo);
		logger.debug("#### Exit from ResourceBalanceRespBuilder ####");
		return rbResp;
		
	}

}
