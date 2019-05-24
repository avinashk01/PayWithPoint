package com.barclaysbank.rewards.process;

import org.springframework.stereotype.Service;

import com.barclaysbank.rewards.process.beans.Process_ProductReq;
import com.barclaysbank.rewards.process.beans.Process_ProductResp;

@Service("proc_prod_i")
public interface Process_Product_I {
	Process_ProductResp getProduct(Process_ProductReq req);

}
