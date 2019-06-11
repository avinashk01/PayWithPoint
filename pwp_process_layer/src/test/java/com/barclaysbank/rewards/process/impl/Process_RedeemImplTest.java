package com.barclaysbank.rewards.process.impl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.anyCollectionOf;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.barclaysbank.rewards.ExceptionSpringBootApp;
import com.barclaysbank.rewards.ProcessSpringBootApp;
import com.barclaysbank.rewards.balance.BalanceBootApplication;
import com.barclaysbank.rewards.process.beans.Process_RedeemResp;
import com.barclaysbank.rewards.process.builder.Process_RedeemRespBuilder;
import com.barclaysbank.rewards.product.ProductBootApplication;
import com.barclaysbank.rewards.redeem.RedeemSpringBootApplication;
import com.barclaysbank.rewards.redeem.dao.bo.DAO_RedeemProductInfo;
import com.barclaysbank.rewards.redeem.dao.impl.DAO_RedeemImpl;

@RunWith(SpringRunner.class)
@SpringBootTest(classes= {ProcessSpringBootApp.class,BalanceBootApplication.class,ProductBootApplication.class,
		RedeemSpringBootApplication.class,ExceptionSpringBootApp.class})
public class Process_RedeemImplTest {
	@MockBean
	DAO_RedeemImpl daoRedeemImpl;
	@MockBean
	Process_RedeemRespBuilder processRedeemRespBuilder;
	@Autowired
	Process_RedeemImpl processRedeemImpl;

	@Before
	public void setUp() throws Exception {
		when(daoRedeemImpl.getRedeemProduct(anyString())).thenReturn(getDAORedeemProductInfo());
		when(processRedeemRespBuilder.build((List<DAO_RedeemProductInfo>) anyCollectionOf(DAO_RedeemProductInfo.class))).thenCallRealMethod();
	}

	@Test
	public void test() {
		Process_RedeemResp processRedeemResp = processRedeemImpl.getRedeem("5298000100265987");
		assertNotNull(processRedeemResp);
		assertThat(processRedeemResp.getRedeemInfoList().size()).isEqualTo(2);
		assertThat(processRedeemResp.getRedeemInfoList().get(0).getPurchaseDate()).isEqualTo(new Date(2019-06-05));
		
	}
	
	@After
	public void tearDown() throws Exception {
	}
	
	private List<DAO_RedeemProductInfo> getDAORedeemProductInfo(){
		List<DAO_RedeemProductInfo> daoRedeemProductInfoList = new ArrayList<DAO_RedeemProductInfo>();
		DAO_RedeemProductInfo daoRedeemProductInfo = new DAO_RedeemProductInfo();
		daoRedeemProductInfo.setCardNum("5298000100265987");
		daoRedeemProductInfo.setDeliveryDate(new Date(2019-06-10));
		daoRedeemProductInfo.setOrderId(1);
		daoRedeemProductInfo.setPrice(995);
		daoRedeemProductInfo.setProductId(1);
		daoRedeemProductInfo.setProductName("Keybord");
		daoRedeemProductInfo.setPurchaseDate(new Date(2019-06-05));
		
		daoRedeemProductInfoList.add(daoRedeemProductInfo);
		
		daoRedeemProductInfo = new DAO_RedeemProductInfo();
		daoRedeemProductInfo.setCardNum("5298000100265987");
		daoRedeemProductInfo.setDeliveryDate(new Date(2019-06-03));
		daoRedeemProductInfo.setOrderId(2);
		daoRedeemProductInfo.setPrice(250);
		daoRedeemProductInfo.setProductId(2);
		daoRedeemProductInfo.setProductName("Mouse");
		daoRedeemProductInfo.setPurchaseDate(new Date(2019-06-01));
		
		daoRedeemProductInfoList.add(daoRedeemProductInfo);
		
		
		return daoRedeemProductInfoList;
		
	}


}
