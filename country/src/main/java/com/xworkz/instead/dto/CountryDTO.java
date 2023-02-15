package com.xworkz.instead.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="country_table")
public class CountryDTO {

	@Id
	@Column(name="c_id")
	private int id;
	@Column(name="c_name")
	private String countryName;
	@Column(name="c_capital")
	private String capital;
	@Column(name="c_pm")
	private String pm;
	@Column(name="c_language")
	private String language;
	@Column(name="c_population")
	private Double population;
}
