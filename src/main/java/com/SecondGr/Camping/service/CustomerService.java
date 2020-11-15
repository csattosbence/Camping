package com.SecondGr.Camping.service;

import com.SecondGr.Camping.dao.entity.CustomerEntity;
import org.springframework.http.ResponseEntity;

import java.net.URISyntaxException;
import java.util.List;

public interface CustomerService {

    public ResponseEntity<CustomerEntity> record(CustomerEntity customer) throws URISyntaxException;

    public List<CustomerEntity> readAll();

}
