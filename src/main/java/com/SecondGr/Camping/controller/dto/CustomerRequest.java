package com.SecondGr.Camping.controller.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CustomerRequest {

    private Long id;

    private String name;

    private String email;

    private String phoneNumber;

    private String address;
}
