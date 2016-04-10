package com.service.impl;

import com.entity.Customer;
import com.entity.Role;
import com.repository.CustomerRepository;
import com.service.CustomerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{
    
    @Autowired
    private CustomerRepository customerRepository;
    
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public Customer addCustomer(String firstName, String lastName, String password) {
        Customer c = new Customer();
        c.setFirstName(firstName);
        c.setLastName(lastName);
        c.setPassword(bCryptPasswordEncoder.encode(password));
        c.setRole(Role.ROLE_CUSTOMER);
        c.setEnabled(true);
        Customer cc =  customerRepository.saveAndFlush(c);
        return cc;
    }
    @Override
    public Customer addCustomer(Customer customer) {
        Customer c = customer;
        c.setPassword(bCryptPasswordEncoder.encode(c.getPassword()));
        c.setEnabled(true);
        c.setRole(Role.ROLE_CUSTOMER);
        return customerRepository.saveAndFlush(c);
    }

    @Override
    public void delete(String id) {
        try{
            int idd = Integer.valueOf(id); 
            customerRepository.delete(idd);
        } catch(Exception e){
            
        }
    }

    @Override
    public Customer findById(int id) {
        return customerRepository.findById(id);
    }
    
}
