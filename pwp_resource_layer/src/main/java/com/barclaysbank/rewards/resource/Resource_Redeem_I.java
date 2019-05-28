package com.barclaysbank.rewards.resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.barclaysbank.rewards.resource.beans.Resource_ClientContext;
import com.barclaysbank.rewards.resource.beans.Resource_CustomerContext;
import com.barclaysbank.rewards.resource.beans.Resource_RedeemResp;

public interface Resource_Redeem_I {
	Resource_RedeemResp getRedeem(@PathVariable("cardNum") String cardNum,Resource_ClientContext clientContext,Resource_CustomerContext custContext);

}
