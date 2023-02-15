package com.xworkz.dto;

public class CasinoDTO {

	private String name;
	private String cruise;
	private boolean entryFee;
	private boolean freefood;
	@Override
	public String toString() {
		return "CasinoDTO [name=" + name + ", cruise=" + cruise + ", entryFee=" + entryFee + ", freefood=" + freefood
				+ "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCruise() {
		return cruise;
	}
	public void setCruise(String cruise) {
		this.cruise = cruise;
	}
	public boolean isEntryFee() {
		return entryFee;
	}
	public void setEntryFee(boolean entryFee) {
		this.entryFee = entryFee;
	}
	public boolean isFreefood() {
		return freefood;
	}
	public void setFreefood(boolean freefood) {
		this.freefood = freefood;
	}
	
	
}
