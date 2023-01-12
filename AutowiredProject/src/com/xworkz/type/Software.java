package com.xworkz.type;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Software {
	@Autowired
	@Qualifier("name")
	private String name;
	@Autowired
	@Qualifier("version")
	private int version;
	@Autowired
	@Qualifier("developer")
	private String developer;
	@Autowired
	@Qualifier("date")
	private LocalDate date;
	@Autowired
	@Qualifier("free")
	private boolean free;
	
	public Software() {
		System.out.println("Registering software default const");
	}

	@Override
	public String toString() {
		return "Sortware [name=" + name + ", version=" + version + ", developer=" + developer + ", date=" + date
				+ ", free=" + free + "]";
	}
	


}
