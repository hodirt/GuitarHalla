
package com.service;

import com.entity.Customer;


public interface CustomerService {
    Customer addCustomer(String firstname, String lastname, String password);
    Customer addCustomer(Customer customer);
    Customer findById(int id);
    void delete(String id);
}
