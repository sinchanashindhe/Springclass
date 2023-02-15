package com.xworkz.valentine.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="valentine_table")
public class ValentineEntity {

	@Id
	@Column(name="v_id")
	private int  id;
	@Column(name="v_name")
	private String name;
	@Column(name="v_valentine_name")
	private String valentinename;
	@Column(name="v_places")
	private String places;
	@Column(name="v_gifts")
	private String gift;
	
	
}
