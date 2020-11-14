package com.SecondGr.Camping.service;

import com.SecondGr.Camping.dao.entity.CustomerEntity;
import com.SecondGr.Camping.dao.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;

    public List<CustomerEntity> readAll(){
        return customerRepository.findAll();
    }


    public void record(){

    }

}
