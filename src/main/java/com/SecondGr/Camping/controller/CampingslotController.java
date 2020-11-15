package com.SecondGr.Camping.controller;

import com.SecondGr.Camping.dao.entity.CampingslotEntity;
import com.SecondGr.Camping.service.CampingslotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/camping")
public class CampingslotController {

    @Autowired
    private CampingslotService campingslotService;

    @PostMapping()
    public ResponseEntity<CampingslotEntity> addSlot(@RequestBody CampingslotEntity campingslot) throws URISyntaxException {
        return campingslotService.addSlot(campingslot);
    };
    @GetMapping("/{id}")
    public ResponseEntity<?> querySlot(@PathVariable Long id){
        return campingslotService.querySlot(id);
    }
    @GetMapping
    public List<CampingslotEntity> queryAll(){
        return campingslotService.queryAll();
    }
    
}
