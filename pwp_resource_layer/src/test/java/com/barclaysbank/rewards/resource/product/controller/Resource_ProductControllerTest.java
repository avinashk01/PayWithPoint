package com.barclaysbank.rewards.resource.product.controller;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyDouble;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpHeaders;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.barclaysbank.rewards.process.beans.Process_BalanceResp;
import com.barclaysbank.rewards.process.beans.Process_ProductInfo;
import com.barclaysbank.rewards.process.beans.Process_ProductResp;
import com.barclaysbank.rewards.process.impl.Process_BalanceImpl;
import com.barclaysbank.rewards.process.impl.Process_ProductImpl;
import com.barclaysbank.rewards.resource.beans.Resource_CardDetails;
import com.barclaysbank.rewards.resource.beans.Resource_ClientContext;
import com.barclaysbank.rewards.resource.beans.Resource_ServiceDtls;
import com.barclaysbank.rewards.resource.builder.Resource_ProductRespBuilder;
import com.barclaysbank.rewards.resource.controller.Resource_ProductController;
import com.barclaysbank.rewards.resource.validator.ResourceRequestValidator;

@RunWith(SpringRunner.class)
@WebMvcTest(value=Resource_ProductController.class, secure=false)
public class Resource_ProductControllerTest {
	@Autowired private MockMvc mockMvc;
	@MockBean Process_ProductImpl processProductImpl;
	@MockBean Process_BalanceImpl processBalanceImpl;
	@MockBean ResourceRequestValidator resourceRequestValidator;
	@MockBean Resource_ProductRespBuilder resourceProductRespBuilder;

	@Before public void setUp() throws Exception {
		when(resourceRequestValidator.validateRequest(anyString(),
				any(Resource_ClientContext.class), any(Resource_ServiceDtls.class),
				any(Resource_CardDetails.class))).thenReturn(true);
		when(processBalanceImpl.getBalance(anyString())).thenReturn(
				getProcessBalanceResp());
		when(processProductImpl.getProduct(anyDouble())).thenReturn(
				getProcessProductResp());
		when(resourceProductRespBuilder.build(any(Process_ProductResp.class))).
		thenCallRealMethod();

	}

	@Test public void test() throws Exception {
		String expected = "{'statusBlock':{'respCode':'0','respMsg':'Success','errorCode':null,'errorMsg':null},'productList':[{'name':'Keybord','description':'Wireless with 10m range','price':600.0,'vendorName':'Lenevo'},{'name':'Mouse','description':'Wire 1000dpi range','price':500.0,'vendorName':'Longitech'}]}";
		HttpHeaders httpHeaders = new HttpHeaders(); 
		httpHeaders.set("msgTs", "2019-06-09 11:00");
		httpHeaders.set("clientId", "1"); httpHeaders.set("channelId", "1");
		httpHeaders.set("correlationId", "586"); 
		httpHeaders.set("svcName","pwpservice");
		httpHeaders.set("apiName", "getproductapi");
		httpHeaders.set("version", "v1"); 
		httpHeaders.set("cvvNum", "895");
		httpHeaders.set("expDate", "2022-02-05"); 
		httpHeaders.set("nameOnCard","Denial"); 
		
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/pwpservice/product/5298000100265987").headers(httpHeaders); 
		MvcResult mvcResult = mockMvc.perform(requestBuilder).andReturn();
		System.out.println("RESPONSE DATA : "+mvcResult.getResponse().getContentAsString()); 
		JSONAssert.assertEquals(expected,mvcResult.getResponse().getContentAsString(), true); }

	@After public void tearDown() throws Exception { 

	}

	private Process_BalanceResp getProcessBalanceResp() { Process_BalanceResp
		processBalanceResp = new Process_BalanceResp();
	processBalanceResp.setAvailablePts(1000); return processBalanceResp;

	}

	private Process_ProductResp getProcessProductResp() { Process_ProductResp
		processProductResp = new Process_ProductResp(); List<Process_ProductInfo>
		processProductInfoList = new ArrayList<Process_ProductInfo>();
		Process_ProductInfo processProductInfo = new Process_ProductInfo();
		processProductInfo.setDescription("Wireless with 10m range");
		processProductInfo.setName("Keybord"); processProductInfo.setPrice(600);
		processProductInfo.setVendorName("Lenevo");
		processProductInfoList.add(processProductInfo);

		processProductInfo = new Process_ProductInfo();
		processProductInfo.setDescription("Wire 1000dpi range");
		processProductInfo.setName("Mouse"); processProductInfo.setPrice(500);
		processProductInfo.setVendorName("Longitech");
		processProductInfoList.add(processProductInfo);

		processProductResp.setProductInfoList(processProductInfoList);

		return processProductResp;

	}










}
