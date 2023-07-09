package com.stringjoiner;

import java.util.StringJoiner;

public class Demo {
	
	public static void main(String[] args) {
		//there r 2 constructors in strJoiner-
		//StringJoiner( delimiter)   StringJoiner( delimiter,prefix, suffix)
		
		StringJoiner stringJoiner = new StringJoiner("-");
		//StringJoiner stringJoiner = new StringJoiner("-","[","}");
		
		stringJoiner.add("Ram");
		stringJoiner.add("Laxman");
		stringJoiner.add("Bharat");
		
		System.out.println(stringJoiner);
	}

}
