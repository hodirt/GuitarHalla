
package com.service;

import com.entity.Customer;


public interface CustomerLoginService {
    
    Customer getCustomer(String firstname, String password);
}
