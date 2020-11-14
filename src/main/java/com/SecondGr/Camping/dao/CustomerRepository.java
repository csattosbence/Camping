package com.SecondGr.Camping.dao;

import com.SecondGr.Camping.dao.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerEntity,Long> {
}
