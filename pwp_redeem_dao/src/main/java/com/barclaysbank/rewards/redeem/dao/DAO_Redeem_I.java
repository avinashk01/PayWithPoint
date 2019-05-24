package com.barclaysbank.rewards.redeem.dao;

import org.springframework.stereotype.Repository;

import com.barclaysbank.rewards.redeem.dao.beans.DAO_RedeemReq;
import com.barclaysbank.rewards.redeem.dao.beans.DAO_RedeemResp;

@Repository("dao_redm_i")
public interface DAO_Redeem_I {
	DAO_RedeemResp getProduct(DAO_RedeemReq req);

}
