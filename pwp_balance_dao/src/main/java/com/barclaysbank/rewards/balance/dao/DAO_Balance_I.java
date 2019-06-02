package com.barclaysbank.rewards.balance.dao;

import com.barclaysbank.rewards.balance.dao.bo.DAO_BalanceInfo;

public interface DAO_Balance_I {
	DAO_BalanceInfo getBalance(String cardNum);

}
