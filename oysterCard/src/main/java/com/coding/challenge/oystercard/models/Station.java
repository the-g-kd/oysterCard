package com.coding.challenge.oystercard.models;

import java.util.ArrayList;

import com.coding.challenge.oystercard.exceptions.InsufficnientFundsException;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Station implements TravelMode {
	
	public static final double MAX_FARE = 3.2;
	private StationData data;

	//This probably belongs in the Gate object. For now lets say its in Station.
	/* (non-Javadoc)
	 * @see com.coding.challenge.oystercard.models.TravelMode#tapIn(com.coding.challenge.oystercard.models.OysterCard)
	 */
	public double tapIn(OysterCard card) throws InsufficnientFundsException {
		return card.charge(MAX_FARE);
	}
}
