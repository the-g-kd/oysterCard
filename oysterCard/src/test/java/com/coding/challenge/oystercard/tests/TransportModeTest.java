package com.coding.challenge.oystercard.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

import com.coding.challenge.oystercard.exceptions.InsufficnientFundsException;
import com.coding.challenge.oystercard.models.Bus;
import com.coding.challenge.oystercard.models.Journey;
import com.coding.challenge.oystercard.models.OysterCard;
import com.coding.challenge.oystercard.models.Station;
import com.coding.challenge.oystercard.models.StationData;
import com.coding.challenge.oystercard.models.TravelMode;
/**
 * 
 * @author GireeshVenkateswaran
 * TODO: Dependency Injection
 *
 */
public class TransportModeTest {
	//private double MAX_FARE = 3.2;
	
	@Test
	public void testTapIn_at_station_success() {
		double initialTopUp = 30.00;
		try {
			
			assertTrue(tapInAtStation(initialTopUp)==initialTopUp-Station.MAX_FARE);
			
		} catch (InsufficnientFundsException e) {
			// TODO Auto-generated catch block
			assertTrue(false);
		}
	}
	
	@Test
	public void testTapIn_at_station_failure() {
		double initialTopUp = 2.00;
		try {
			
			assertFalse(tapInAtStation(initialTopUp)==initialTopUp-Station.MAX_FARE);
			
		} catch (InsufficnientFundsException e) {
			// TODO Auto-generated catch block
			assertTrue(true);
		}
		
	}
	
	private double tapInAtStation(double initialTopUp) throws InsufficnientFundsException {
		ArrayList<Integer> zoneList = new ArrayList();
		zoneList.add(1);
		StationData holbournStationData = new StationData(zoneList, "Holburn");
		TravelMode holbourn = new Station(holbournStationData);
		Journey journey = new Journey(holbournStationData, null);
		OysterCard myOysterCard = new OysterCard(30.00, journey);
		return holbourn.tapIn(myOysterCard);
	}

	/**
	 * Bus Section
	 */
	
	@Test
	public void testTapIn_at_bus_success() {
		double initialTopUp = 30.00;
		try {
			
			assertTrue(tapInAtBus(initialTopUp)==initialTopUp-Bus.MAX_FARE);
			
		} catch (InsufficnientFundsException e) {
			// TODO Auto-generated catch block
			assertTrue(false);
		}
	}
	
	@Test
	public void testTapIn_at_bus_failure() {
		double initialTopUp = 2.00;
		try {
			
			assertFalse(tapInAtBus(initialTopUp)==initialTopUp-Bus.MAX_FARE);
			
		} catch (InsufficnientFundsException e) {
			// TODO Auto-generated catch block
			assertTrue(true);
		}
		
	}
	
	private double tapInAtBus(double initialTopUp) throws InsufficnientFundsException {
		TravelMode anyRandomStop = new Bus();
		ArrayList<Integer> zoneList = new ArrayList();
		zoneList.add(1);
		StationData h2Data = new StationData(null, "H2");
		Journey journey = new Journey(h2Data, null);
		OysterCard myOysterCard = new OysterCard(30.00, journey);
		return anyRandomStop.tapIn(myOysterCard);
	}
}
