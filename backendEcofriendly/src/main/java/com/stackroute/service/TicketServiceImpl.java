package com.stackroute.service;

import com.stackroute.customExceptions.TicketAlreadyExistsException;
import com.stackroute.domain.Ticket;
import com.stackroute.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService {
    @Autowired
    private TicketRepository ticketRepository;
    @Override
    public Ticket saveRepos(Ticket ticket) throws TicketAlreadyExistsException {
        if(ticketRepository.existsById(ticket.getTicketNumber()))
        {
            throw new TicketAlreadyExistsException("Track is already Present");
        }
        Ticket savedTicket = ticketRepository.save(ticket);
        if(savedTicket == null)
        {
            throw new TicketAlreadyExistsException("Track is already Present");
        }
        return savedTicket;

    }
}
