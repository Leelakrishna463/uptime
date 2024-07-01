package com.decathlon.uptime.controller;

import com.decathlon.uptime.model.Application;
import com.decathlon.uptime.repository.ApplicationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.SequencedCollection;

@RestController
@RequestMapping("/applications")
@RequiredArgsConstructor
@Component
public class ApplicationController {

    private ApplicationRepository applicationRepository;

    @GetMapping("")
    public SequencedCollection<Application> getApplications() {
        return applicationRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Application> getApplication(@PathVariable int id) {
        return applicationRepository.findById(id);
    }
}
