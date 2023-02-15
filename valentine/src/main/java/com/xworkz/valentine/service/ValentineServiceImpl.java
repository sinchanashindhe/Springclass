package com.xworkz.valentine.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.valentine.dto.ValentineDTO;
import com.xworkz.valentine.entity.ValentineEntity;
import com.xworkz.valentine.repositary.ValentineRepo;
@Service
public class ValentineServiceImpl implements ValentineService {


	@Autowired 
	private ValentineRepo valentinerepositary;
	
	public ValentineServiceImpl() {
	System.out.println("created:"+this.getClass().getSimpleName());
	}
	
	@Override
	public Set<ConstraintViolation<ValentineDTO>> validateAndSave(ValentineDTO dto) {
		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
	    Validator validator=factory.getValidator();
	   Set<ConstraintViolation<ValentineDTO>> violations= validator.validate(dto);
			   if(violations !=null && !violations.isEmpty()) {
				   System.err.println("violation in dto"+dto);
				   return violations;
			   }else {
				   System.out.println("violation is not there in dto ,can save");
				   ValentineEntity entity =new ValentineEntity();
				   entity.setName(dto.getName());
				   entity.setValentinename(dto.getValentineName());
				   entity.setPlaces(dto.getPlace());
				   entity.setGift(dto.getGift());
				   
				   boolean saved= this.valentinerepositary.save(entity);
						   System.out.println("Entity Data is saved"+saved);
				   return Collections.emptySet();
			   } 
		
	}

}
