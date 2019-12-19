package com.alm.highfi.service;

import com.alm.highfi.model.Ticket;
import com.alm.highfi.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl {
    @Autowired(required = false)
    private TicketRepository repository;

    public TicketServiceImpl() {
    }

    public List<Ticket> listTickets() {
        return (List<Ticket>) repository.findAll();
    }
}
