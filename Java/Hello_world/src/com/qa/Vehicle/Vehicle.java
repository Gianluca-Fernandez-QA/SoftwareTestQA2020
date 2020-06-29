package com.qa.Vehicle;

public class Vehicle extends Garage {
private int wheelsNo;
private String coatColour;
private int passengersCap;
private int maxSpeed;
public Vehicle(int wheelsNo, String coatColour, int passengersCap, int maxSpeed) {
	this.wheelsNo = wheelsNo;
	this.coatColour = coatColour;
	this.passengersCap = passengersCap;
	this.maxSpeed = maxSpeed;
}
public Vehicle() {
	
}
public int getWheelsNo() {
	return wheelsNo;
}
public void setWheelsNo(int wheelsNo) {
	this.wheelsNo = wheelsNo;
}
public String getCoatColour() {
	return coatColour;
}
public void setCoatColour(String coatColour) {
	this.coatColour = coatColour;
}
public int getPassengersCap() {
	return passengersCap;
}
public void setPassengersCap(int passengersCap) {
	this.passengersCap = passengersCap;
}
public int getMaxSpeed() {
	return maxSpeed;
}
public void setMaxSpeed(int maxSpeed) {
	this.maxSpeed = maxSpeed;
}


}
