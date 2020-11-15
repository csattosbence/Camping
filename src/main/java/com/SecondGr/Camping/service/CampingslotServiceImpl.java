package com.SecondGr.Camping.service;

import com.SecondGr.Camping.dao.entity.CustomerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

@Service
public class CampingslotServiceImpl extends CustomerService{

    @Autowired
    private CampingslotRepository campingslotRepository;

    public ResponseEntity<CampingslotEntity> addSlot(CampingslotEntity campingslot) throws URISyntaxException {
        CustomerEntity result = campingslotRepository.save(campingslot);
        return ResponseEntity.created(new URI("/camping" + result.getId())).body(result);
    }

    public ResponseEntity<?>querySlot(Long id){
        Optional<CustomerEntity> campingSlot = campingslotRepository.findById(id);
        return campingSlot.map(response -> ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    public List<CampingslotEntity> queryAll(){
        campingslotRepository.findAll();
    }
}
