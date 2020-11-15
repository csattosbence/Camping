package com.SecondGr.Camping.controller;

import com.SecondGr.Camping.dao.entity.CustomerEntity;
import com.SecondGr.Camping.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;
import java.util.List;


@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping()
    public List<CustomerEntity> readAll(){
        return customerService.readAll();
    }

    @GetMapping("/{id}")
    ResponseEntity<?> getCustomer(@PathVariable Long id){
        return customerService.getCustomer(id);
    }

    @PostMapping("/record")
    ResponseEntity<CustomerEntity> record(@RequestBody CustomerEntity customer) throws URISyntaxException {
        return customerService.record(customer);
    }

}
