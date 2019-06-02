package com.barclaysbank.rewards.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.barclaysbank.rewards.bo.Validate_CardDetails;

public interface CardDetailsJPARepository extends JpaRepository<Validate_CardDetails, String>{
	Validate_CardDetails findByCardNum(String cardNum);
}
