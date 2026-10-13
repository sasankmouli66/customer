package com.vcube.customer.service;

import java.util.List;
import com.vcube.customer.model.CustomerModel;

public interface CustomerService {

   
    CustomerModel createCustomerInfo(CustomerModel c);

 
    List<CustomerModel> getAllCustomerInfo();

   
    CustomerModel getCustomerId(Integer id);

   
    CustomerModel updateCustomerInfo(CustomerModel c);

    
    void deleteCustomerInfo(Integer id);


	CustomerModel updateCustomerInfo(CustomerModel c, Integer id);
}
