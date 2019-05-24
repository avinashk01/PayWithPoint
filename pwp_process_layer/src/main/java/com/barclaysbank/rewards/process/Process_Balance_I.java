package com.barclaysbank.rewards.process;


import org.springframework.stereotype.Service;

import com.barclaysbank.rewards.process.beans.Process_BalanceReq;
import com.barclaysbank.rewards.process.beans.Process_BalanceResp;

@Service("proc_bal_i")
public interface Process_Balance_I {
	Process_BalanceResp getBalance(Process_BalanceReq req);

}
