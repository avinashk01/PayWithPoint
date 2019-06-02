package com.barclaysbank.rewards.process;

import com.barclaysbank.rewards.process.beans.Process_RedeemResp;

public interface Process_Redeem_I {
	Process_RedeemResp getRedeem(String cardNum);

}
