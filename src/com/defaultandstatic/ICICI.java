package com.defaultandstatic;

public class ICICI implements RBIBank {
	
	public static void main(String[] args) {
		ICICI obj = new ICICI(); //to call def. meth.-obj must be created
		obj.followGuidelines();//we r calling default meth.of RBIBank by using object of ICICI
								//obj of interface can't be created
		
		//RBIBank.test();//calling static method directly-no obj created
	}

	@Override //we can override  default
	public void followGuidelines() {
		RBIBank.super.followGuidelines();
	}
	
	/*@Override //CE, we can't override  STATIC
	public void test() {
		
	}*/
	

}
