package com.example.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.boot.entity.EmployeeEntity;

public interface EmployeeJPARepository extends JpaRepository<EmployeeEntity, Integer>{

}
