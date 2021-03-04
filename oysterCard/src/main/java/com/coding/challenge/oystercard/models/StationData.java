package com.coding.challenge.oystercard.models;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StationData {
	public ArrayList<Integer> zoneList;
	public String name;


}