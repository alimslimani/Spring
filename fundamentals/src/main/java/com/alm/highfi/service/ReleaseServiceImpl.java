package com.alm.highfi.service;

import com.alm.highfi.model.Release;
import com.alm.highfi.repository.ReleaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReleaseServiceImpl {

    @Autowired(required = false)
    private ReleaseRepository repository;

    public ReleaseServiceImpl() {
    }

    public List<Release> listReleases() {
        return (List<Release>) repository.findAll();
    }
}
