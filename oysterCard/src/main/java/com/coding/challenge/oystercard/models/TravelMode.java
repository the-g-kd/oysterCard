package com.coding.challenge.oystercard.models;

import com.coding.challenge.oystercard.exceptions.InsufficnientFundsException;

public interface TravelMode {

	//This probably belongs in the Gate object. For now lets say its in Station.
	double tapIn(OysterCard card) throws InsufficnientFundsException;

}