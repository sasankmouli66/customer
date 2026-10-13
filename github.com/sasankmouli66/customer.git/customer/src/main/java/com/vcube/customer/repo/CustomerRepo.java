package com.vcube.customer.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vcube.customer.model.CustomerModel;

@Repository
public interface CustomerRepo extends JpaRepository<CustomerModel, Integer>{

}
