package com.barclaysbank.rewards.product.dao.impl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.anyDouble;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.barclaysbank.rewards.product.ProductBootApplication;
import com.barclaysbank.rewards.product.dao.bo.DAO_ProductInfo;
import com.barclaysbank.rewards.product.repository.ProductJPARepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes= {ProductBootApplication.class})
public class DAO_ProductImplTest {
	@Autowired
	DAO_ProductImpl daoProductImpl;
	@MockBean
	ProductJPARepository productJPARepository;


	@Before
	public void setUp() throws Exception {
		when(productJPARepository.findByPriceLessThan(anyDouble())).thenReturn(getProductsList());
	}

	@Test
	public void test() {
		List<DAO_ProductInfo> productList = daoProductImpl.getProduct(1000);
		assertNotNull(productList);
		verify(productJPARepository,times(1)).findByPriceLessThan(1000);
		assertThat(daoProductImpl.getProduct(1000).size()).isEqualTo(2);
		
	}

	
	private List<DAO_ProductInfo> getProductsList(){
		List<DAO_ProductInfo> daoProductList = new ArrayList<DAO_ProductInfo>();
		DAO_ProductInfo daoProductInfo = new DAO_ProductInfo();
		daoProductInfo.setDescription("Wireless with 10m range");
		daoProductInfo.setIsStock((short) 1);
		daoProductInfo.setName("Mouse");
		daoProductInfo.setPrice(599);
		daoProductInfo.setProductId(2);
		daoProductInfo.setVendorName("Longitech");
		daoProductList.add(daoProductInfo);
		
		daoProductInfo = new DAO_ProductInfo();
		daoProductInfo.setDescription("Wireless with 10m range");
		daoProductInfo.setIsStock((short) 1);
		daoProductInfo.setName("Keybord");
		daoProductInfo.setPrice(599);
		daoProductInfo.setProductId(1);
		daoProductInfo.setVendorName("Lenevo");
		daoProductList.add(daoProductInfo);
		return daoProductList;
	}
	
	
	
	
	
	
}
