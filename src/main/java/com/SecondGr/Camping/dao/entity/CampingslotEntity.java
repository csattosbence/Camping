package com.SecondGr.Camping.dao.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="campingslot")
public class CampingslotEntity {
    @Id
    private Long id;

    @Column
    private int coordinateX;

    @Column
    private int coordinateY;

    @Column
    private int price;

    @Column
    private byte status;


}
