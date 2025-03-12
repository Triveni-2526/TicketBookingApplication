package com.ticket.dao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepo extends JpaRepository<TicketEntity, Integer>{

	public TicketEntity findByPnr(String pnr);
}
