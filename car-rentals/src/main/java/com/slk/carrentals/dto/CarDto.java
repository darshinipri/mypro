package com.slk.carrentals.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarDto {
	
	private int carId;
	
	private String brand;
	
	private String model;
	
	private String registrationNumber;
	
	private String availability;
	

}
