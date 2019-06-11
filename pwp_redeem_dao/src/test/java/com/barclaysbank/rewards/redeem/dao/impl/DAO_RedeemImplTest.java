package com.barclaysbank.rewards.redeem.dao.impl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.barclaysbank.rewards.redeem.dao.bo.DAO_RedeemProductInfo;
import com.barclaysbank.rewards.redeem.repository.RedeemJPARepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DAO_RedeemImplTest {
	@Autowired
	DAO_RedeemImpl daoRedeemImpl;
	@MockBean
	RedeemJPARepository redeemJPARepository;

	@Before
	public void setUp() throws Exception {
		when(redeemJPARepository.findByCardNum(anyString())).thenReturn(getRedeemProductsInfo());
	}

	@Test
	public void test() {
		List<DAO_RedeemProductInfo> redeemProductInfoList = daoRedeemImpl.getRedeemProduct("5426974633");
		assertNotNull(redeemProductInfoList);
		verify(redeemJPARepository, times(1)).findByCardNum("5426974633");
		assertThat(daoRedeemImpl.getRedeemProduct("5426974633").size()).isEqualTo(2);
	}
	
	private List<DAO_RedeemProductInfo> getRedeemProductsInfo(){
		List<DAO_RedeemProductInfo> redeemProductInfoList = new ArrayList<DAO_RedeemProductInfo>();
		DAO_RedeemProductInfo daoRedeemProductInfo = new DAO_RedeemProductInfo();
		daoRedeemProductInfo.setDeliveryDate(new Date(2019-06-12));
		daoRedeemProductInfo.setOrderId(1);
		daoRedeemProductInfo.setPrice(550);
		daoRedeemProductInfo.setProductId(1);
		daoRedeemProductInfo.setProductName("Mouse");
		daoRedeemProductInfo.setPurchaseDate(new Date(2019-06-06));
		
		redeemProductInfoList.add(daoRedeemProductInfo);
		
		daoRedeemProductInfo = new DAO_RedeemProductInfo();
		daoRedeemProductInfo.setDeliveryDate(new Date(2019-06-15));
		daoRedeemProductInfo.setOrderId(2);
		daoRedeemProductInfo.setPrice(650);
		daoRedeemProductInfo.setProductId(2);
		daoRedeemProductInfo.setProductName("Keybord");
		daoRedeemProductInfo.setPurchaseDate(new Date(2019-06-02));
		
		redeemProductInfoList.add(daoRedeemProductInfo);
		
		return redeemProductInfoList;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
