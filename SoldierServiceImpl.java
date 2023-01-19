package com.xworkz.soldier.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.soldier.dto.SoldierDTO;
import com.xworkz.soldier.repo.SoldierRepo;

import io.quarkus.arc.runtime.BeanContainer.Factory;

public class SoldierServiceImpl  implements SoldierService{
	
	private SoldierRepo soldierRepo;

	public SoldierServiceImpl() {
		System.out.println("created SoldierServiceImpl using no -arg const...");
	}
	public void setSoldierRepo(SoldierRepo soldierRepo) {
		this.soldierRepo = soldierRepo;
	}
	 
	@Override
	public boolean validateAndSave(SoldierDTO dto) {
	System.out.println("starting validateAndSave");
	System.out.println("dto passed :" +dto);
	
	
	ValidatorFactory factory =Validation.buildDefaultValidatorFactory();
	Validator validator	=  factory.getValidator();
	Set<ConstraintViolation<SoldierDTO>> violations = validator.validate(dto);
			if(!violations.isEmpty()) {
				System.err.println("There are validations errors..");
				violations.forEach(v ->{System.out.println("violating message :"+v.getMessage());
				});
					return false;
				}
			else {
				System.out.println("Data is valid..");
				boolean saved = soldierRepo.save(dto);
				System.out.println("Dto saved using repo"+ saved);
				
		return saved;
			
			}
	}
}
	
	

