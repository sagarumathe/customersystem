package com.vasyerp.customermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vasyerp.customermanagement.model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}
