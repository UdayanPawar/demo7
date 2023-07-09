package com.functionalinterface;

@FunctionalInterface
public interface Test {
	
	void getStudentNAme(String name);//only one ABSTRACT METH-semicolon..no body{}
	//public abstract bydefault
	
	default void getStudentid(int id) { //other methods-with body
	}
	default void getStudentsalary(int salary) {
	}
}