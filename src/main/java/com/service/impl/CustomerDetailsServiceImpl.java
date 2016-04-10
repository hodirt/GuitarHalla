
package com.service.impl;

import com.entity.Customer;
import com.repository.CustomerRepository;
import java.util.ArrayList;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userDetailsService")
public class CustomerDetailsServiceImpl implements UserDetailsService{
    
    @Autowired
    private CustomerRepository customerRepository;
    

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String firstName) throws UsernameNotFoundException {
        com.entity.Customer customer = null;
        customer = customerRepository.findByName(firstName);
        System.out.println(customer.getRole().toString());
        if(customer == null){
            return null;
        }
        
        Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority((customer.getRole().toString())));
        System.out.println(customer.getRole().toString());
        User u = new User(String.valueOf(customer.getId()), customer.getPassword(), customer.isEnabled(), true, true, true, authorities);
        return u;
    }
    
}
