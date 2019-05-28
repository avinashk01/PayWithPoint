package com.barclaysbank.rewards.resource;

import org.springframework.web.bind.annotation.PathVariable;

import com.barclaysbank.rewards.resource.beans.Resource_ClientContext;
import com.barclaysbank.rewards.resource.beans.Resource_CustomerContext;
import com.barclaysbank.rewards.resource.beans.Resource_ProductResp;

public interface Resource_Product_I {
	Resource_ProductResp getProduct(@PathVariable("cardNum") String cardNum,Resource_ClientContext clientContext,Resource_CustomerContext custContext);

}
