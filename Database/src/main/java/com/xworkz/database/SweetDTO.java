package com.xworkz.database;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sweetdto_table")
public class SweetDTO {

	@Column(name = "sl_no")
	@Id

	private int Slno;
	@Column(name = "s_name")
	private String name;
	@Column(name = "s_type")
	private String type;
	@Column(name = "s_color")
	private String color;
	@Column(name = "s_price")
	private String price;
}
