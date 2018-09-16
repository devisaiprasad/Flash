package com.javalearn1;

public class ConstructorEx3 {
	
	void m1(ConstructorEx3 c){
		System.out.println("method is invoked"); 
	}
	
	 void p1(){
		  m1(this);
		  System.out.println(this);//prints the reference ID  
		  }

	public static void main(String[] args) {
		
		ConstructorEx3 c = new ConstructorEx3();
		System.out.println(c);//prints the reference ID  
		c.p1();

	}

}
