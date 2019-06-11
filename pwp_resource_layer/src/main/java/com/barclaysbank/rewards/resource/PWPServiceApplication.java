package com.barclaysbank.rewards.resource;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.barclaysbank.rewards.resource.filter.CorrelationHeaderFilter;

@SpringBootApplication(scanBasePackages= {"com.barclaysbank.rewards"})

public class PWPServiceApplication {
	
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

	
	
	
	
	
}
