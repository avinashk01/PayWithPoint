package com.barclaysbank.rewards.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.barclaysbank.rewards.product.dao.bo.DAO_ProductInfo;
import com.barclaysbank.rewards.product.dao.impl.DAO_ProductImpl;

@SpringBootApplication
public class ProductBootApplication implements CommandLineRunner{
	@Autowired
	DAO_ProductImpl dao;
	
	public static void main(String[] args) {
		SpringApplication.run(ProductBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//List<DAO_ProductInfo> products = dao.getProduct(500);
		//System.out.println(products);
		
	}

}
