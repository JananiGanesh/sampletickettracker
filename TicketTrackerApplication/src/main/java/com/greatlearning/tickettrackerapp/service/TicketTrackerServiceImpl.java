package com.greatlearning.tickettrackerapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.tickettrackerapp.dao.TicketRepository;
import com.greatlearning.tickettrackerapp.entity.TicketTracker;

@Service
public class TicketTrackerServiceImpl implements TicketService {
	
	@Autowired
	TicketRepository repository;

	@Override
	public List<TicketTracker> getAllTickets() {
		 return repository.findAll();		
	}

	@Override
	public TicketTracker getTicketByID(int id) {
		Optional<TicketTracker> opticket=repository.findById(id);
		if(opticket.isPresent()) {
			return opticket.get();
		}
		
		return null;
	}

	@Override
	public void saveTicket(TicketTracker ticket) {
		repository.save(ticket);
		
	}

	@Override
	public int deleteByTicketId(int id) {
		repository.deleteById(id);
		return id;
	}

	@Override
	public List<TicketTracker> searchTickets(String query) {
	
	//	Optional <TicketTracker> opt_ticket=repository.
		
		
		return null;
	}

}
