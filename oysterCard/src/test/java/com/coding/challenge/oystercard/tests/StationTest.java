package com.coding.challenge.oystercard.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.coding.challenge.oystercard.models.InsufficnientFundsException;
import com.coding.challenge.oystercard.models.Journey;
import com.coding.challenge.oystercard.models.OysterCard;
import com.coding.challenge.oystercard.models.Station;
/**
 * 
 * @author GireeshVenkateswaran
 * TODO: Dependency Injection
 *
 */
public class StationTest {
	private double MAX_FARE = 3.2;
	
	@Test
	public void testTapIn_success() {
		double initialTopUp = 30.00;
		try {
			
			assertTrue(tapIn(initialTopUp)==initialTopUp-MAX_FARE);
			
		} catch (InsufficnientFundsException e) {
			// TODO Auto-generated catch block
			assertTrue(false);
		}
	}
	
	@Test
	public void testTapIn_failure() {
		double initialTopUp = 2.00;
		try {
			
			assertFalse(tapIn(initialTopUp)==initialTopUp-MAX_FARE);
			
		} catch (InsufficnientFundsException e) {
			// TODO Auto-generated catch block
			assertTrue(true);
		}
		
	}
	
	private double tapIn(double initialTopUp) throws InsufficnientFundsException {
		Station holbourn = new Station(1, "Holburn");
		Journey journey = new Journey(holbourn, null);
		OysterCard myOysterCard = new OysterCard(30.00, journey);
		return holbourn.tapIn(myOysterCard);
	}

}
