package com.javalearn1;

public class ConstructorEx {
	int id;
	String name;
	float avg;
	static int count = 0;
	
	// Default Constructor (Not execute when para constructor available)
	ConstructorEx(){
		System.out.println("This is Default Constructor");
		id = 200;
		name = "Krish";
	}
	
	//Parameterized Constructor 2
	ConstructorEx(int i, String n){
		System.out.println("This is Parameterized Constructor 2");
		id = i;
		name = n;
		count++;
	}	
	
	//Parameterized Constructor 1
	ConstructorEx(float avg){
		this();
		System.out.println("This is Parameterized Constructor 1 ");
		//avg = avg;
		this.avg = avg;
	}
	
	public void display(){
		System.out.println(id+" " + name+" " + avg);
	}
	
	

	public static void main(String[] args) {
		ConstructorEx c = new ConstructorEx(100,"Krishna");
		
		c.display();
		System.out.println(ConstructorEx.count);
		
		ConstructorEx c1 = new ConstructorEx(50);
		c1.display();
	}
	

}
