package com.barclaysbank.rewards.resource;

import com.barclaysbank.rewards.resource.beans.Resource_BalanceResp;

public interface Resource_Balance_I {
	Resource_BalanceResp getBalance(String clientId,String channelId,String cardNum,String corelationId,String msgTs);

}
