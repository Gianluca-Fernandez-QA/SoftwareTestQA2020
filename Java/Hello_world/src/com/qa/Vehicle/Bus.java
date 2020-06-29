package com.qa.Vehicle;

public class Bus extends Vehicle {
private boolean hasChildren;

	public Bus(int wheelsNo, String coatColour, int passengersCap, int maxSpeed, boolean hasChildren) {
		super(wheelsNo, coatColour, passengersCap, maxSpeed);
		this.hasChildren = hasChildren;
	}
	public Bus() {
		
	}
	public boolean isHasChildren() {
		return hasChildren;
	}
	public void setHasChildren(boolean hasChildren) {
		this.hasChildren = hasChildren;
	}
	
	

}
