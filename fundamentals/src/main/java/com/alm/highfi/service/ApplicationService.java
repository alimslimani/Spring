package com.alm.highfi.service;

import com.alm.highfi.model.Application;
import com.alm.highfi.exception.ApplicationNotFoundException;
import com.alm.highfi.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Optional;

@Service
public class ApplicationService {

    @Autowired
    private ApplicationRepository applicationRepository;

    public Application findApplication(long id) {
        Optional<Application> optionalApplication = applicationRepository.findById(id);
        if (optionalApplication.isPresent()) {
            return optionalApplication.get();
        } else
            throw new ApplicationNotFoundException("Application not found");
    }

    public List<Application> listOfApplications() {
        return (List<Application>) applicationRepository.findAll();
    }

    public Long count() {
        return applicationRepository.count();
    }

    public void deleteById(Long userId) {
        applicationRepository.deleteById(userId);
    }

}
