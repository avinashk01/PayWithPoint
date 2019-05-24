package com.barclaysbank.rewards.resource;

import com.barclaysbank.rewards.resource.beans.Resource_RedeemResp;

public interface Resource_Redeem_I {
	Resource_RedeemResp getRedeem(String clientId,String channelId,String cardNum,String corelationId,String msgTs);

}
