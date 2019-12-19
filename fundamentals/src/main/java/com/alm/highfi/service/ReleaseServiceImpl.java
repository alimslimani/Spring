package com.alm.highfi.service;

import com.alm.highfi.model.Release;
import com.alm.highfi.repository.ReleaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReleaseServiceImpl {

    private ReleaseRepository repository;

    @Autowired
    public ReleaseServiceImpl(ReleaseRepository repository) {
        System.out.println("ReleaseServiceImpl repository constructor");
        this.repository = repository;
    }

    public List<Release> listReleases() {
        return (List<Release>) repository.findAll();
    }
}
