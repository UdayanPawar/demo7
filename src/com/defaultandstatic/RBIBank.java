package com.defaultandstatic;

public interface RBIBank {
	
	default void followGuidelines() {
		System.out.println("RBI Bank");
		System.out.println("1) adhar card and pan card linking mandatory");
	}
	
	static void test() {
		System.out.println("static method test");
	}

}
