package com.coding.challenge.oystercard.models;

import com.coding.challenge.oystercard.exceptions.InsufficnientFundsException;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor

public class Bus  implements TravelMode {
	
	public static final double MAX_FARE = 1.8;
	
	public double tapIn(OysterCard card) throws InsufficnientFundsException {
		
		return card.charge(MAX_FARE);
	}
	
	

}
