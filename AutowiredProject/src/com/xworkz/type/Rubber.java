package com.xworkz.type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Rubber {

	
	
	@Autowired
	@Qualifier("rubberName")
	 private String name;
	@Autowired
	@Qualifier("rubberType")
	 private String type;
	@Autowired
	@Qualifier("rubberPrice")
	 private double price;
	@Autowired
	@Qualifier("rubberColour")
	 private String colour;
	@Autowired
	@Qualifier("rubberShape")
	 private String shape;
	@Autowired
	@Qualifier("size")
	 private String size;
	
	public Rubber() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Rubber [name=" + name + ", type=" + type + ", price=" + price + ", colour=" + colour + ", shape="
				+ shape + ", size=" + size + "]";
	}
	
	
}
