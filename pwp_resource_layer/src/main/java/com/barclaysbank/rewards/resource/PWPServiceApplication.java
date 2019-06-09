package com.barclaysbank.rewards.resource;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.barclaysbank.rewards.resource.controller.Resource_BalanceController;
import com.barclaysbank.rewards.resource.filter.CorrelationHeaderFilter;

@SpringBootApplication(scanBasePackages= {"com.barclaysbank.rewards"})

public class PWPServiceApplication implements CommandLineRunner{
	@Autowired
	Resource_BalanceController resourceBalanceImpl;
	public static void main(String[] args) {
		
		SpringApplication.run(PWPServiceApplication.class, args);
		
	}
	
	@Bean
    public FilterRegistrationBean correlationHeaderFilter() {
        FilterRegistrationBean filterRegBean = new FilterRegistrationBean();
        filterRegBean.setFilter(new CorrelationHeaderFilter());
        filterRegBean.setUrlPatterns(Arrays.asList("/*"));

        return filterRegBean;
    }

	@Override
	public void run(String... args) throws Exception {
		/*
		 * Resource_ServiceDtls svcDtls = new Resource_ServiceDtls("pwpservice",
		 * "getbalanceapi", "v1"); Resource_CardDetails cardDtls = new
		 * Resource_CardDetails("5298000100265987", "895", "2022-02-05", "Denial");
		 * Resource_CustomerContext custContext = new Resource_CustomerContext();
		 * custContext.setCardDtls(cardDtls); custContext.setSvcDtls(svcDtls);
		 * Resource_BalanceResp resp =
		 * resourceBalanceImpl.getBalance("5298000100265987", "2019-06-02 11:00", "2",
		 * "2", "8745asdfds", custContext); System.out.println(resp);
		 */
	}

	
	
	
	
	
	
	
	
	
}
