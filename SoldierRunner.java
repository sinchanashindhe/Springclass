package com.xworkz.soldier.boot;

import com.xworkz.soldier.dto.SoldierDTO;
import com.xworkz.soldier.repo.SoldierRepo;
import com.xworkz.soldier.repo.SoldierRepoImpl;
import com.xworkz.soldier.service.SoldierServiceImpl;

public class SoldierRunner {

	public static void main(String[] args) {
	
		SoldierDTO dto =new SoldierDTO("VilramBatra",1,"Topper","Manekshaw","india");
				
				SoldierServiceImpl service = new SoldierServiceImpl();
				SoldierRepo repo =new SoldierRepoImpl();
				service.setSoldierRepo(repo);
				service.validateAndSave(dto);
			
	}

}
