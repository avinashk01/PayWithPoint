package com.barclaysbank.rewards.process;

import com.barclaysbank.rewards.process.beans.Process_BalanceResp;

public interface Process_Balance_I {
	Process_BalanceResp getBalance(String cardNum);

}
