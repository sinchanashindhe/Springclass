package com.xworkz.qualifier.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Snake {

	private String name;
	@Autowired
	@Qualifier("snakeLength")
	private float length;
	@Autowired
	@Qualifier("snakeColour")
	private String colour;
	private String type;
	private boolean poisionous;
	
	

	public Snake(@Qualifier("SnakeName") String name,@Qualifier("SnakeType") String type, @Qualifier("SnakePoisionous")boolean poisionous) {
		super();
		this.name = name;
		this.type = type;
		this.poisionous = poisionous;
	}

	@Override
	public String toString() {
		return "Snake [name=" + name + ", length=" + length + ", colour=" + colour + ", type=" + type + ", poisionous="
				+ poisionous + "]";
	}
	
	
	
	
	
	
}
