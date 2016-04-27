/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.repository;

import com.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
    
    @Query("select c from Customer c where c.firstName = :firstName and c.password = :password")//за допомогою цих запитів створювати гітари в базі даних і витягувати їх
    Customer findByNameAndPassword(@Param("firstName") String firstName, @Param("password") String password);
    
    @Query("select c from Customer c where c.firstName = :firstName")//за допомогою цих запитів створювати гітари в базі даних і витягувати їх
    Customer findByName(@Param("firstName") String firstName);
    
    @Query("select c from Customer c where c.id = :id")
    Customer findById(@Param("id") int id);
    
    //@Query("select new com.dto.CustomUser(u.id, u.name) from User u")
}
