
package com.service.impl;

import com.entity.Customer;
import com.repository.CustomerRepository;
import com.service.CustomerLoginService;
import org.springframework.beans.factory.annotation.Autowired;


public class CustomerLoginServiceImpl implements CustomerLoginService{
    
    @Autowired
    private CustomerRepository customerRepository;
    
    @Override
    public Customer getCustomer(String firstname, String password) {
        return customerRepository.findByNameAndPassword(firstname, password);
    }
    
    
}
