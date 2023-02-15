package com.xworkz.instead.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.instead.dto.CMDTO;

public interface CMService {

	Set<ConstraintViolation<CMDTO>> validateAndSave(CMDTO cmdto);
}
