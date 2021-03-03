package com.coding.challenge.oystercard.models;

import com.coding.challenge.oystercard.exceptions.InsufficnientFundsException;
import com.coding.challenge.oystercard.models.Journey.JourneyBuilder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Station {
	
	private final double MAX_FARE = 3.2;
	private int zone;
	private String name;
	
	//This probably belongs in the Gate object. For now lets say its in Station.
	public double tapIn(OysterCard card) throws InsufficnientFundsException {
		return card.charge(MAX_FARE);
	}
}
