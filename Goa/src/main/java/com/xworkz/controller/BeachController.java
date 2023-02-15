package com.xworkz.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.dto.BeachDTO;

@Component
@RequestMapping("/beach")
public class BeachController {

	public BeachController() {
		System.out.println("created:"+ this.getClass().getSimpleName());
	}
	
	@PostMapping
	public String onBeach(BeachDTO beachDTO,Model model) {
		System.out.println("Running onbeach"+beachDTO);
		model.addAttribute("Name",beachDTO.getName());
		model.addAttribute("Location",beachDTO.getLocation());
		model.addAttribute("Game",beachDTO.getGame());
		return "beachSucess.jsp";
	}
}

