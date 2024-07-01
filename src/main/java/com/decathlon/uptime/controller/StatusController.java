package com.decathlon.uptime.controller;

import com.decathlon.uptime.dto.StatusDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class StatusController {

    @GetMapping("/status")
    public ResponseEntity<StatusDTO> getStatus(){
        StatusDTO status = new StatusDTO(LocalDateTime.now(), "UP");
        return new ResponseEntity<>(status, HttpStatus.OK);
    }

}
