package com.coding.challenge.oystercard.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Journey {
	private TravelMode start;
	private TravelMode end;
}
