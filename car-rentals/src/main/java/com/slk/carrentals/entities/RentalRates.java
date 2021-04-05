package com.slk.carrentals.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="rental_rates")
public class RentalRates {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="rentalrates_id")
	private int rentalRatesId;
	
	private int hours;
	
	private double daily;
	
	private double weekly;

	private double monthly;
	
	@Column(name="late_charges")
	private double lateCharges;



}
