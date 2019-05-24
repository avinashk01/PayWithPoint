package com.barclaysbank.rewards.resource;

import com.barclaysbank.rewards.resource.beans.Resource_ProductResp;

public interface Resource_Product_I {
	Resource_ProductResp getProduct(String clientId,String channelId,String cardNum,String corelationId,String msgTs);

}
