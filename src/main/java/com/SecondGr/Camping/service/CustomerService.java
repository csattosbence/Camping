package com.SecondGr.Camping.service;

import com.SecondGr.Camping.dao.entity.CustomerEntity;

import java.util.List;

public interface CustomerService {

    public void record();

    public List<CustomerEntity> readAll();

}
