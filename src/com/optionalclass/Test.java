package com.optionalclass;

import java.util.Optional;

public class Test {
	
	public static void main(String[] args) {
		String[] str = new String[10];
		
	//null check
		//using if block
		/*if(str[5] != null) {
			System.out.println(str[5].toLowerCase());
		}else {
			System.out.println("NA");
		}*/
		
		//using Optional cls--2methods-ofNullable,isPresent
		//str[5] = "VELOCITY";
		Optional<String> checkNull=Optional.ofNullable(str[5]);
		
		if(checkNull.isPresent()) {
			System.out.println(str[5]);
			System.out.println(str[5].toLowerCase());//method of string
		}else {
			System.out.println("NA");
		}
		
	}

}
