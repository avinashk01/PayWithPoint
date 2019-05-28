package com.barclaysbank.rewards.resource.impl;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

import com.barclaysbank.rewards.resource.Resource_Redeem_I;
import com.barclaysbank.rewards.resource.beans.Resource_ClientContext;
import com.barclaysbank.rewards.resource.beans.Resource_CustomerContext;
import com.barclaysbank.rewards.resource.beans.Resource_RedeemResp;

@RequestMapping("/redeem")
public class Resource_RedeemImpl implements Resource_Redeem_I{

	@Override
	public Resource_RedeemResp getRedeem(
			@PathVariable("cardNum") String cardNum,
			@RequestHeader Resource_ClientContext clientContext,
			@RequestBody Resource_CustomerContext custContext
			) {
		// TODO Auto-generated method stub
		return null;
	}


}
