package com.xworkz.type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pencil {
	
	@Autowired
	@Qualifier("pencilName")
	 private String name;
	@Autowired
	@Qualifier("type")
	 private String type;
	@Autowired
	@Qualifier("price")
	 private double price;
	@Autowired
	@Qualifier("colour")
	 private String colour;
	@Autowired
	@Qualifier("sharp")
	 private boolean sharp;
	 
	 public Pencil() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pencil [name=" + name + ", type=" + type + ", price=" + price + ", colour=" + colour + ", sharp="
				+ sharp + "]";
	}

}
