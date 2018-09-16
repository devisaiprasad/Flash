package com.javalearn1;

// use one object in multiple classes.
public class ConstructorEx4 {
	int data = 10;
	
	ConstructorEx4(){  
		   B b=new B(this);  
		   b.display();  
		  } 

	public static void main(String[] args) {
		ConstructorEx4 c = new ConstructorEx4();

	}

}

class B{  
	ConstructorEx4 obj;  
	  B(ConstructorEx4 obj){  
	    this.obj=obj;  
	  }  
	  void display(){  
	    System.out.println(obj.data);//using data member of A4 class  
	  }  
	}