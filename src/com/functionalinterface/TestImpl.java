package com.functionalinterface;

public class TestImpl implements Test {

	@Override //meth. of Test
	public void getStudentNAme(String name) {
	      System.out.println(name);
		
	}
	
	public static void main(String[] args) {
		TestImpl t = new TestImpl();
		t.getStudentNAme("Ram");
	}

}
