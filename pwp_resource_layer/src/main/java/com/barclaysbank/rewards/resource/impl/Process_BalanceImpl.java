package com.barclaysbank.rewards.resource.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.barclaysbank.rewards.resource.Resource_Balance_I;
import com.barclaysbank.rewards.resource.beans.Resource_BalanceResp;

@RestController
@RequestMapping("/balance")
public class Process_BalanceImpl implements Resource_Balance_I{

	@Override
	public Resource_BalanceResp getBalance(String clientId, String channelId, String cardNum, String corelationId,
			String msgTs) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
