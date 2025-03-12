package com.ticket.dao;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="passanger_details")
public class PassengerEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer passengerId;
	private String passengerName;
	private String fromLoc;
	private String toLoc;
	private LocalDate journeyDate;
	private String email;
	private String trainName;

}
