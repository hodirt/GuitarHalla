
package com.service;

import com.entity.Customer;
import com.entity.Guitar;
import java.util.List;


public interface CustomerService {
    Customer addCustomer(String firstname, String lastname, String password);
    Customer addCustomer(Customer customer);
    Customer findById(int id);
    Customer addToBuyList(Guitar guitar, int id);
    List<Guitar> getBuyList(int id);
    void delete(String id);
    void deleteFromBuyList(int idCustomerm, int idInCollection);
}
