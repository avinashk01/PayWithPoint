package com.barclaysbank.rewards.resource;

import com.barclaysbank.rewards.resource.beans.Resource_BalanceResp;
import com.barclaysbank.rewards.resource.beans.Resource_ClientContext;
import com.barclaysbank.rewards.resource.beans.Resource_CustomerContext;

public interface Resource_Balance_I {
	Resource_BalanceResp getBalance(String cardNum, Resource_ClientContext clientContext,Resource_CustomerContext custContext);

}
