
package com.service;

import com.repository.CustomerRepository;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author home
 */
class UniqueFieldValidator implements ConstraintValidator<UniqueField, String>{
    
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void initialize(UniqueField a) {    
    }

    @Override
    public boolean isValid(String f, ConstraintValidatorContext cvc) {
        return customerRepository.findByName(f) == null;
    }
    
}
