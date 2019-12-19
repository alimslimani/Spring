package com.alm.highfi.controller;

import com.alm.highfi.model.Application;
import com.alm.highfi.model.Ticket;
import com.alm.highfi.exception.ApplicationNotFoundException;
import com.alm.highfi.service.ApplicationService;
import com.alm.highfi.service.TicketServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/")
public class TzaController {
    @Autowired
    private ApplicationService applicationService;
    @Autowired
    private TicketServiceImpl ticketServiceImpl;

    @GetMapping("/tickets")
    public ResponseEntity<List<Ticket>> getAllTickets() {
        List<Ticket> tickets = (List<Ticket>) ticketServiceImpl.listTickets();
        return new ResponseEntity<>(tickets, HttpStatus.OK);
    }

    @GetMapping("/applications")
    public ResponseEntity<List<Application>> getAllPllications() {
        List<Application> tickets = (List<Application>) applicationService.listOfApplications();
        return new ResponseEntity<>(tickets, HttpStatus.OK);
    }

    @GetMapping("/application/{id}")
    private ResponseEntity<Application> getApplication(@PathVariable("id") long id) {
        try {
            return new ResponseEntity<Application>(applicationService.findApplication(id), HttpStatus.OK);
        } catch (ApplicationNotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Application not found");
        }
    }

    @GetMapping("/application/count")
    public Long count() {
        return applicationService.count();
    }

}
