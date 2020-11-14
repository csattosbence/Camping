package com.SecondGr.Camping.controller.dto;

import com.SecondGr.Camping.dao.entity.CustomerEntity;
import com.SecondGr.Camping.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    @PostMapping("/record")
    public void record(){

    }

}
