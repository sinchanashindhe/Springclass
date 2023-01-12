package com.xworkz.type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SmartWatch {

	

	@Autowired
	@Qualifier("watchName")
	private String name;
	@Autowired
	@Qualifier("watchBrand")
	private String brand;
	@Autowired
	@Qualifier("watchPrice")
	private double price;
	@Autowired
	@Qualifier("watchColour")
	private String colour;
	@Autowired
	@Qualifier("weight")
	private float weight;
	
	public SmartWatch() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SmartWatch [name=" + name + ", brand=" + brand + ", price=" + price + ", colour=" + colour + ", weight="
				+ weight + "]";
	}
	
}
