package com.xworkz.instead.service;

import com.xworkz.instead.dto.CountryDTO;

public interface CountryService {

	boolean validateAndSave(CountryDTO dto);
}