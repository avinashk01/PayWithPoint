package com.barclaysbank.rewards.resource;

import com.barclaysbank.rewards.resource.beans.Resource_BalanceResp;
import com.barclaysbank.rewards.resource.beans.Resource_RequestBody;
import com.sun.xml.internal.ws.api.policy.PolicyResolver.ClientContext;

public interface Resource_Balance_I {
	Resource_BalanceResp getBalance(String cardNum, ClientContext clientContext,Resource_RequestBody reqBody);

}
