package com.xworkz.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.dto.CasinoDTO;
@Component
@RequestMapping("/casino")
public class CasinoController {

	public class BeachController {

		public BeachController() {
			System.out.println("created:"+ this.getClass().getSimpleName());
		}
		
		@PostMapping
		public String onBeach(CasinoDTO casinoeachDTO,Model model) {
			System.out.println("Running onCasino"+casinoeachDTO);
			model.addAttribute("Name",casinoeachDTO.getName());
			model.addAttribute("Cruise",casinoeachDTO.getCruise());
			model.addAttribute("EntryFee",casinoeachDTO.isEntryFee());
			return "CasinoSucess.jsp";
		}
}
}