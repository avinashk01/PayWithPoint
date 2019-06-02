package com.barclaysbank.rewards.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.barclaysbank.rewards.bo.Validate_ClientContext;

public interface ClientChannelJPARepository extends JpaRepository<Validate_ClientContext, String>{
	Validate_ClientContext findByClientId(String clientId);
	
}
