package com.kakfa_demo.controller;

import com.kakfa_demo.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(value = "/location")
public class KafkaController {
    @Autowired
    private KafkaService kafkaService;
    @PostMapping(value = "/update")
    public ResponseEntity<?> updateLocation()
    {
        this.kafkaService.updateLocation("( "+Math.round(Math.random()*100)+" , "
                +Math.round(Math.random()*100)+" )");
        return new ResponseEntity<>(Map.of("message :","Location Updated"), HttpStatus.OK);
    }
}
