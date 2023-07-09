package com.defaultandstatic2;

public class VehMain {
	public static void main(String[] args) {
		
		Vehicles vehicles=new Car();
		vehicles.horn();
		vehicles.speedometer();//default=can't call directly using interface name
		Vehicles.headlight();//static=directly using interface name,also no need to create obj
		
		
		Vehicles vehicles2=new Bike();
		vehicles2.horn();
		vehicles2.speedometer();
		
	
	}
}
