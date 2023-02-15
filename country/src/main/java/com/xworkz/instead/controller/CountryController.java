package com.xworkz.instead.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.instead.dto.CountryDTO;
import com.xworkz.instead.service.CountryService;

@Controller
@RequestMapping("/india")
public class CountryController {

	@Autowired
	private CountryService service;
	
	public CountryController() {
	System.out.println("Create:"+this.getClass().getSimpleName());
	}
	
	@PostMapping
	public String onOrder(CountryDTO dto,Model model) {
		System.out.println("running onOrder"+dto);
		boolean saved=service.validateAndSave(dto);
		System.out.println("saved:"+saved);
		return "index";
		
	}
}
