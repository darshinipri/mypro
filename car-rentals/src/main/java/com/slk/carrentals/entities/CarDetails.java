package com.slk.carrentals.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="car_details")
public class CarDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cardetails_id")
	private int carDetailsId;
	
	@Column(name="carcategory_name")
	private String carCategoryName;
	
	private String transmission;
	
	private String seating;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="car_id" ,referencedColumnName = "car_id")
	private Car car;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="carDetails_id",referencedColumnName = "carDetails_id" )
	private List<RentalRates> rentalRates;
	

}
