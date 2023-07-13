package com.greatlearning.tickettrackerapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.tickettrackerapp.entity.TicketTracker;

public interface TicketRepository  extends JpaRepository<TicketTracker, Integer>{

}
