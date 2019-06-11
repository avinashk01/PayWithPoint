package com.barclaysbank.rewards.redeem.dao;

import java.util.List;

import com.barclaysbank.rewards.redeem.dao.bo.DAO_RedeemProductInfo;

public interface DAO_Redeem_I {
	List<DAO_RedeemProductInfo> getRedeemProduct(String cardNum);

}
