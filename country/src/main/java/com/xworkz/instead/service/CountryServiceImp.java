package com.xworkz.instead.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.instead.dto.CountryDTO;
import com.xworkz.instead.repositary.CountryRepo;
import com.xworkz.instead.repositary.CountryRepositary;

@Service
public class CountryServiceImp implements CountryService{

	@Autowired
	private  CountryRepo repo;
	
	public  CountryServiceImp() {
	System.out.println("Created"+this.getClass().getSimpleName());
	}
	
	@Override
	public boolean validateAndSave(CountryDTO dto) {
		System.out.println("running alidte and save in CountryService");
		boolean saved=repo.save(dto);
		System.out.println("saved:"+saved);
		return false;
	}
}