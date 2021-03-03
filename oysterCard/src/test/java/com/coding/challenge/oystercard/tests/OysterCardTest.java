package com.coding.challenge.oystercard.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.coding.challenge.oystercard.models.InsufficnientFundsException;
import com.coding.challenge.oystercard.models.OysterCard;

public class OysterCardTest {

	@Test
	public void testCardBalanceIs_zero() {
		assertTrue(new OysterCard().getBalance()==0.0);
	}
	
	@Test
	public void testTopUp() {
		
		OysterCard myCard = new OysterCard(30.0,null);
		
		assertTrue(myCard.getBalance()==30.0);
	}
	
	@Test
	public void testInSufficientFunds_success() {
		OysterCard myCard = new OysterCard(1.00,null);
		
		try {
			assertTrue(myCard.charge(1.5)>0);
		}catch (InsufficnientFundsException isfe) {
			assertTrue(true);
		}
	}
	
	@Test
	public void testInSufficientFunds_failure() {
		OysterCard myCard = new OysterCard(10.00,null);
		
		try {
			myCard.charge(1.5);
			assertTrue(true);
		}catch (InsufficnientFundsException isfe) {
			assertTrue(false);
		}
	}

}
