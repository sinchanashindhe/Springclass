package com.xworkz.valentine.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.valentine.dto.ValentineDTO;
import com.xworkz.valentine.service.ValentineService;

@Controller
@RequestMapping("/valentine")

public class ValentineController {

	@Autowired
	private ValentineService valentineservice;

	private List<String> places=Arrays.asList("cubbon park","BTM","Lal Bagh","Hebbal","jp nagar");
	
	private	 List<String> gifts=Arrays.asList("Teddy","Chocolate","I-phone","Saree");
	
	public ValentineController() {
	System.out.println("created:"+this.getClass().getSimpleName());
	}
	
	@GetMapping
	public String onValentine(Model model) {
		model.addAttribute("places", places);
		model.addAttribute("gifts", gifts);	

		System.out.println("running onValentine get method");
		
	return "Valentine";
}
		

@PostMapping
public String onValentine(Model model,ValentineDTO dto) {
	System.out.println("running onValentine post method"+dto);
	
	Set<ConstraintViolation<ValentineDTO>> violations= valentineservice.validateAndSave(dto);
	if(violations.isEmpty()) {
		System.out.println("no violationin controller go to sucess page");
	return "ValentineSucess";
}
	model.addAttribute("places",places);
	model.addAttribute("gifts",gifts);
	model.addAttribute("error",violations);
	System.err.println("violation in controller");
	return "Valentine";
}
}

