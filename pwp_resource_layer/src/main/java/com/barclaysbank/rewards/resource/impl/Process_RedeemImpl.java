package com.barclaysbank.rewards.resource.impl;

import org.springframework.web.bind.annotation.RequestMapping;

import com.barclaysbank.rewards.resource.Resource_Redeem_I;
import com.barclaysbank.rewards.resource.beans.Resource_RedeemResp;

@RequestMapping("/redeem")
public class Process_RedeemImpl implements Resource_Redeem_I{

	@Override
	public Resource_RedeemResp getRedeem(String clientId, String channelId, String cardNum, String corelationId,
			String msgTs) {
		// TODO Auto-generated method stub
		return null;
	}


}
