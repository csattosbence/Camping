package com.SecondGr.Camping.service;

import com.SecondGr.Camping.dao.entity.CustomerEntity;
import com.SecondGr.Camping.dao.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;

    public List<CustomerEntity> readAll(){
        return customerRepository.findAll();
    }

    public ResponseEntity<?> getCustomer(Long id){
        Optional<CustomerEntity> customer = customerRepository.findById(id);
        return customer.map(response -> ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }


    public ResponseEntity<CustomerEntity> record(CustomerEntity customer) throws URISyntaxException {
        CustomerEntity result = customerRepository.save(customer);
        return ResponseEntity.created(new URI("/customer" + result.getId())).body(result);
    }

}
