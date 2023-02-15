package com.xworkz.dto;

public class BeachDTO {
	
	private String name;
	private String location;
	private boolean clean;
	private String game;
	@Override
	public String toString() {
		return "BeachDTO [name=" + name + ", location=" + location + ", clean=" + clean + ", game=" + game + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public boolean isClean() {
		return clean;
	}
	public void setClean(boolean clean) {
		this.clean = clean;
	}
	public String getGame() {
		return game;
	}
	public void setGame(String game) {
		this.game = game;
	}
	
	
}
