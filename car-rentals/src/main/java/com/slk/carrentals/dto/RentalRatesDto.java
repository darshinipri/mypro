package com.slk.carrentals.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RentalRatesDto {
	
   private int rentalRatesId;
	
	private int hours;
	
	private double daily;
	
	private double weekly;

	private double monthly;
	
	private double lateCharges;
	
	

}
