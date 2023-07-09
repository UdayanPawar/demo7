package com.lambda;

public class MAin {
	
	public static void main(String[] args) {
		Addition addition = (a,b) ->(a*b); //no need of (int a,int b)//return type =Addition(I)
		System.out.println(addition.add(10, 20));
		
		Addition addition2 = (a,b) -> (a+b);
		System.out.println(addition2.add(20, 20));
	}

}


