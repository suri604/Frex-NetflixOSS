package com.stackroute.service;


import com.stackroute.customExceptions.TicketAlreadyExistsException;
import com.stackroute.domain.Ticket;

import java.util.List;

public interface TicketService {
    public Ticket saveRepos(Ticket ticket) throws TicketAlreadyExistsException;

}