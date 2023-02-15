package com.xworkz.instead.controller;

import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.instead.dto.CMDTO;
import com.xworkz.instead.service.CMService;

@Controller
@RequestMapping("/cm")
public class CMController {
	
	@Autowired
	private CMService cmservice;
	
	public CMController() {
		System.out.println("Create:"+this.getClass().getSimpleName());
	}
	
	@PostMapping
	public String onCM(CMDTO cmdto,Model model) {
		System.out.println("running onCM"+cmdto);
		Set<ConstraintViolation<CMDTO>>constraintViolation=this.cmservice.validateAndSave(cmdto);
		if(!constraintViolation.isEmpty()) {
			System.out.println("validation failed,display error message");
			constraintViolation.forEach((cv)->System.out.println(cv));
		}else {
			System.out.println("validation success,display success message");
		}
		
		return "cm";
	}
}
