package com.defaultandstatic2;

public class Bike implements Vehicles{

	@Override
	public void horn() {
		System.out.println("pep pep");
	}
	
	@Override
	public void speedometer() {
		System.out.println("def meth overriden..");
	}
	
	/*@Override       //CE ,static can't be overriden
	public void headlight() {
		
	}*/
	
}
