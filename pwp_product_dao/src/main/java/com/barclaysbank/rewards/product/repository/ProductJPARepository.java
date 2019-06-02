package com.barclaysbank.rewards.product.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.barclaysbank.rewards.product.dao.bo.DAO_ProductInfo;

public interface ProductJPARepository extends JpaRepository<DAO_ProductInfo, Integer>{

	List<DAO_ProductInfo> findByPriceLessThan(double price);

}
