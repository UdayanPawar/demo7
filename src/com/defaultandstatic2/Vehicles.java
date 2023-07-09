package com.defaultandstatic2;

public interface Vehicles {
	void horn(); //abstract meth
	
	//after 5 years..below 'abstract'method added
	//void speedometer();	
	/*CE occured in all classes which implements  Vehicles I. bcs this method is not overriden 
	by them. to overcome this default & static meth introduced which has body{}*/
	
//default meth & static--no CE in other classes, no need to override this method in other clsess
	//default= when we want to use the method in specific cls(which inherits Vehicles I.)
	default void speedometer() {
		System.out.println("this def meth");
	}
	//static= when we want to use the method in all clsess(which inherits Vehicles I.)
	static void headlight() {
		System.out.println("this sta meth");
	}
}
