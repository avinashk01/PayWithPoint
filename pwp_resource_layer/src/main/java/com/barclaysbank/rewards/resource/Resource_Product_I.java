package com.barclaysbank.rewards.resource;

import org.springframework.web.bind.annotation.PathVariable;

import com.barclaysbank.rewards.resource.beans.Resource_ProductResp;
import com.barclaysbank.rewards.resource.beans.Resource_RequestBody;
import com.sun.xml.internal.ws.api.policy.PolicyResolver.ClientContext;

public interface Resource_Product_I {
	Resource_ProductResp getProduct(@PathVariable("cardNum") String cardNum,ClientContext clientContext,Resource_RequestBody reqBody);

}
