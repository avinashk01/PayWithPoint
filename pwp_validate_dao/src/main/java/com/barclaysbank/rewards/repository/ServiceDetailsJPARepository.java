package com.barclaysbank.rewards.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.barclaysbank.rewards.bo.Validate_ServiceDetails;

public interface ServiceDetailsJPARepository extends JpaRepository<Validate_ServiceDetails, Integer>{
	Validate_ServiceDetails findByApiName(String apiName);
}
