package com.slk.carrentals.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarDetailsDto {
	
	private int carDetailsId;
	
	private String carCategoryName;
	
	private String transmission;
	
	private String seating;
	
	private String mileage;
	
	private String otherDetails;

}
