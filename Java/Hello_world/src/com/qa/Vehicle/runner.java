package com.qa.Vehicle;
import java.util.ArrayList;
public class runner{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus bus = new Bus(6, "Red", 16, 80, true);
		
		ArrayList<Vehicle> Garage = new ArrayList<Vehicle>();
		Garage.add(bus);
		System.out.println();
	}
	
}
