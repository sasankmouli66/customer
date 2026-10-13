package com.vcube.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vcube.customer.model.CustomerModel;
import com.vcube.customer.repo.CustomerRepo;


@Service
public class CustomerServiceImple implements CustomerService {
	
	@Autowired
	CustomerRepo customerRepo;

	@Override
	public CustomerModel createCustomerInfo(CustomerModel c) {
		
		return customerRepo.save(c);
	}

	@Override
	public List<CustomerModel> getAllCustomerInfo() {
		
		return customerRepo.findAll();
	}

	@Override
	public CustomerModel getCustomerId(Integer id) {
		
		return customerRepo.findById(id).get();
	}

	@Override
	public CustomerModel updateCustomerInfo(CustomerModel c,Integer id) {
		CustomerModel customerFromDB = getCustomerId(id);

		customerFromDB.setName(c.getName());
		customerFromDB.setCity(c.getCity());
		customerFromDB.setPhone(c.getPhone());
		customerFromDB.setAge(c.getAge());
		return customerRepo.save(customerFromDB);
	}

	@Override
	public void deleteCustomerInfo(Integer id) {
		
		customerRepo.deleteById(id);
	}

	@Override
	public CustomerModel updateCustomerInfo(CustomerModel c) {
		// TODO Auto-generated method stub
		return null;
	}


}