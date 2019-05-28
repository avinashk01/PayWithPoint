package com.barclaysbank.rewards.resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.barclaysbank.rewards.resource.beans.Resource_RedeemResp;
import com.barclaysbank.rewards.resource.beans.Resource_RequestBody;
import com.sun.xml.internal.ws.api.policy.PolicyResolver.ClientContext;

public interface Resource_Redeem_I {
	Resource_RedeemResp getRedeem(@PathVariable("cardNum") String cardNum,ClientContext clientContext,@RequestBody Resource_RequestBody reqBody);

}
