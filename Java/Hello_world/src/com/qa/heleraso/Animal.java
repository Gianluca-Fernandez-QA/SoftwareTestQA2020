package com.qa.heleraso;



public class Animal {
private String coatColour;
private int lifeSpan = 70;
private int legs;


public Animal(String coatColour, int lifeSpan, int legs) {
	super();
	this.coatColour = coatColour;
	this.lifeSpan = lifeSpan;
	this.legs = legs;
}

public Animal() {
	
}
public String getCoatColour() {
	return coatColour;
}
public void setCoatColour(String coatColour) {
	this.coatColour = coatColour;
}
public int getLifeSpan() {
	return lifeSpan;
}
public void setLifeSpan(int lifeSpan) {
	this.lifeSpan = lifeSpan;
}
public int getLegs() {
	return legs;
}
public void setLegs(int legs) {
	this.legs = legs;
}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub


}
}