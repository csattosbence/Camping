package com.SecondGr.Camping.dao.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name="customer")
public class CustomerEntity {
    @Id
    private Long id;

    @Column
    private String name;
}
