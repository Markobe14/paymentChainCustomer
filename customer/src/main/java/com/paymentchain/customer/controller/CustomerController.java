package com.paymentchain.customer.controller;

import com.paymentchain.customer.entities.Customer;
import com.paymentchain.customer.repository.CustomerRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    
    @Autowired
    CustomerRepository customerRepository;
    
    @GetMapping("/")
    public List<Customer> findAll(){
        return customerRepository.findAll();
    }
    
    @GetMapping("/")
    public Customer getCustomer(){
        return null;
    }
    
    @PostMapping("/")
    public ResponseEntity<?> post(@RequestBody Customer customer){
        Customer save = customerRepository.save(customer);
        return ResponseEntity.ok(save);
    }
    
}
