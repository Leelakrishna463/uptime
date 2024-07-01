package com.decathlon.uptime.repository;

import com.decathlon.uptime.model.Application;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;

@Repository
public interface ApplicationRepository{
    Optional<Application> findById(long id);
    List<Application> findAll();
}
