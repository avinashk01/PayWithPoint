package com.barclaysbank.rewards.process.impl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.anyCollectionOf;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
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
import com.barclaysbank.rewards.process.beans.Process_ProductResp;
import com.barclaysbank.rewards.process.builder.Process_ProductRespBuilder;
import com.barclaysbank.rewards.product.ProductBootApplication;
import com.barclaysbank.rewards.product.dao.bo.DAO_ProductInfo;
import com.barclaysbank.rewards.product.dao.impl.DAO_ProductImpl;
import com.barclaysbank.rewards.redeem.RedeemSpringBootApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes= {ProcessSpringBootApp.class,BalanceBootApplication.class,
		ProductBootApplication.class,RedeemSpringBootApplication.class,ExceptionSpringBootApp.class})
public class Process_ProductImplTest {
	
	@MockBean
	DAO_ProductImpl dapProductImpl;
	@MockBean
	Process_ProductRespBuilder processProductRespBuilder;
	@Autowired
	Process_ProductImpl processProductImpl;

	@Before
	public void setUp() throws Exception {
		when(dapProductImpl.getProduct(1000)).thenReturn(getDaoProductInfoList());
		when(processProductRespBuilder.build((List<DAO_ProductInfo>) anyCollectionOf(DAO_ProductInfo.class)))
		.thenCallRealMethod();
	}


	@Test
	public void test() {
		Process_ProductResp processProductResp = processProductImpl.getProduct(1000);
		assertNotNull(processProductResp);
		assertThat(processProductResp.getProductInfoList().size()).isEqualTo(2);
		assertThat(processProductResp.getProductInfoList().get(0).getName()).isEqualTo("Keybord");
	}
	
	@After
	public void tearDown() throws Exception {
	}
	
	private List<DAO_ProductInfo> getDaoProductInfoList(){
		List<DAO_ProductInfo> daoProductInfoList = new ArrayList<DAO_ProductInfo>();
		DAO_ProductInfo daoProductInfo = new DAO_ProductInfo();
		daoProductInfo.setDescription("Wireless with 10m range");
		daoProductInfo.setIsStock((short) 1);
		daoProductInfo.setName("Keybord");
		daoProductInfo.setPrice(599);
		daoProductInfo.setProductId(1);
		daoProductInfo.setVendorName("Lenevo");
		
		daoProductInfoList.add(daoProductInfo);
		
		daoProductInfo = new DAO_ProductInfo();
		daoProductInfo.setDescription("Wire 1000dpi range");
		daoProductInfo.setIsStock((short) 1);
		daoProductInfo.setName("Mouse");
		daoProductInfo.setPrice(250);
		daoProductInfo.setProductId(2);
		daoProductInfo.setVendorName("Longitech");
		
		daoProductInfoList.add(daoProductInfo);
		
		
		return daoProductInfoList;
	}
	


}
