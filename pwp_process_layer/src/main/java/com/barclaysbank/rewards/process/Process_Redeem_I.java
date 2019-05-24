package com.barclaysbank.rewards.process;

import org.springframework.stereotype.Service;

import com.barclaysbank.rewards.process.beans.Process_RedeemReq;
import com.barclaysbank.rewards.process.beans.Process_RedeemResp;

@Service("proc_redm_i")
public interface Process_Redeem_I {
	Process_RedeemResp getRedeem(Process_RedeemReq req);

}
