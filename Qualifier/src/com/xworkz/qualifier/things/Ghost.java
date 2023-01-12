package com.xworkz.qualifier.things;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Ghost {
	

@Autowired
@Qualifier("ghostName")
private String name;
@Autowired
@Qualifier("ghostGender")
private String gender;
@Autowired
@Qualifier("ghostDeathDate")
private LocalDate deathDate;
@Autowired
@Qualifier("ghostBirthDate")
private LocalDate birthDate;
@Autowired
@Qualifier("ghostDeathLocation")
private String deathLocation;
@Autowired
@Qualifier("ghostReason")
private String reason;
@Autowired
@Qualifier("ghostAlive")
private String aliveIn;
@Autowired
@Qualifier("ghostNailLength")
private float nailLength;
@Autowired
@Qualifier("ghostDressCode")
private String dressCode;
@Autowired
@Qualifier("ghostfreindName")
private String bestFriendName;
private float hairLength;
private boolean married;
private String wifeName;
private String enemyName;
private int ghostId;
private double adharNumber;
private String fatherName;
private String motherName;
private boolean dangerous;
private boolean cute;


public Ghost() {
	// TODO Auto-generated constructor stub
}


public Ghost(float hairLength, boolean married, String wifeName, String enemyName, int ghostId, double adharNumber,
		String fatherName, String motherName, boolean dangerous, boolean cute) {
	super();
	this.hairLength = hairLength;
	this.married = married;
	this.wifeName = wifeName;
	this.enemyName = enemyName;
	this.ghostId = ghostId;
	this.adharNumber = adharNumber;
	this.fatherName = fatherName;
	this.motherName = motherName;
	this.dangerous = dangerous;
	this.cute = cute;



@Override
public String toString() {
	return "Ghost [name=" + name + ", gender=" + gender + ", deathDate=" + deathDate + ", birthDate=" + birthDate
			+ ", deathLocation=" + deathLocation + ", reason=" + reason + ", aliveIn=" + aliveIn + ", nailLength="
			+ nailLength + ", dressCode=" + dressCode + ", bestFriendName=" + bestFriendName + ", hairLength="
			+ hairLength + ", married=" + married + ", wifeName=" + wifeName + ", enemyName=" + enemyName
			+ ", ghostId=" + ghostId + ", adharNumber=" + adharNumber + ", fatherName=" + fatherName
			+ ", motherName=" + motherName + ", dangerous=" + dangerous + ", cute=" + cute + "]";
}
}

