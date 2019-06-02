package com.barclaysbank.rewards.process;

import com.barclaysbank.rewards.process.beans.Process_ProductResp;

public interface Process_Product_I {
	Process_ProductResp getProduct(double price);

}
