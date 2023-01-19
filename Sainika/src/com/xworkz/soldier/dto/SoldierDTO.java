	package com.xworkz.soldier.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import io.smallrye.common.constraint.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class SoldierDTO extends AbstractAuditDTO{
@NotNull
@NotBlank
@Size(min = 3,max =20,message = "Name must be > 3 and < 20")
	private String name;
@Min(value=0,message = "Id must be greater than Zero...")
@Max(10000)
	private int id;
@NotNull
@NotBlank
@Size(min = 5,max = 30)
	private String rank;
	private String battalian;
	private String country;
	
	
}
