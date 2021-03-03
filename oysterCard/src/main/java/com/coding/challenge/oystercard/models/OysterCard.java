package com.coding.challenge.oystercard.models;

import com.coding.challenge.oystercard.models.Journey.JourneyBuilder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OysterCard {


	private double balance;
	
	private Journey currentJourney;
	
	public double topUp(double value) {
		return balance+=value;
	}
	
	public double charge(double fare) throws InsufficnientFundsException {
		//This could become a rule based thing later
		if (balance > fare) {
			balance -=fare;
			//need to add audit here
		}else {
			throw new InsufficnientFundsException();
			//need to add log entries
		}
		
		return balance;
	}
	
}
