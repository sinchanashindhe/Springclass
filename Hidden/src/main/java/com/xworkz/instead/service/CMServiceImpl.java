package com.xworkz.instead.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import javax.xml.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.instead.dto.CMDTO;
import com.xworkz.instead.repositary.CMRepo;

@Service
public class CMServiceImpl implements CMService {

	public CMServiceImpl() {
		System.out.println("Create:"+this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<CMDTO>> validateAndSave(CMDTO cmdto) {
		System.out.println("running validateAndSave");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		javax.validation.Validator validator = factory.getValidator();
		Set<ConstraintViolation<CMDTO>> constraintViolation = validator.validate(cmdto);
		if (constraintViolation != null && !constraintViolation.isEmpty()) {
			System.err.println("ConstraintViolations exist,return ConstraintViolation");
			return constraintViolation;
		} else {
			System.out.println("ConstraintViolations does not exist,data is good ConstraintViolation");
			return Collections.emptySet();

		}

	}

}
