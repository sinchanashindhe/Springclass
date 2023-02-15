package com.xworkz.valentine.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ValentineDTO {
	
    @Size(min=3,max=20,message="Name cannot be less than 3 or greater than 20")
	private String name;
    @NotBlank(message="place should be selected")
	private String place;
    @NotBlank(message="Gift should be selected")
	private String gift;
    @Size(min=3,max=20,message="ValentineName cannot be less than 3 or greater than 20")
	private  String valentineName;
}
