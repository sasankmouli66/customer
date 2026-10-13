package com.vcube.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vcube.customer.model.CustomerModel;
import com.vcube.customer.service.CustomerService;

@RestController
@RequestMapping
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@GetMapping("/hello")
	String hello() {
		return "welcome to my shop";
	}

	@PostMapping("/craetecus")
	CustomerModel createCustomer(@RequestBody CustomerModel c) {
		return customerService.createCustomerInfo(c);
	}

	@GetMapping("/getallcustomer")
	List<CustomerModel> getAllCustmomerId() {
		return customerService.getAllCustomerInfo();
	}

	@GetMapping("/getCustomerid/{id}")
	CustomerModel getcustomerId(@PathVariable Integer id) {
		return customerService.getCustomerId(id);
	}

	@DeleteMapping("getdeleteid/{id}")
	String deleteCustomerInfo(@PathVariable Integer id) {
		customerService.getCustomerId(id);
		return "Delete Sucessfull by Id";
	}

	@PutMapping("/update/{id}")
	CustomerModel updateCustomer(@RequestBody CustomerModel c,@PathVariable Integer id) {
		return customerService.updateCustomerInfo(c,id);
	}
}
