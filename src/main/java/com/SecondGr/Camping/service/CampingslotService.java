package com.SecondGr.Camping.service;

import org.springframework.http.ResponseEntity;

import java.net.URISyntaxException;
import java.util.List;

public interface CampingslotService {
    public ResponseEntity<CampingslotEntity> addSlot(CampingslotEntity campingslot) throws URISyntaxException;

    public ResponseEntity<?>querySlot(Long id);

    public List<CampingslotEntity>queryAll();
}
