package com.javalearn1;

public class ConstructorEx1 {
		int id;
		String name;
		double avg;
		static int count = 0;
		
		// Default Constructor (Not execute when para constructor available)
		ConstructorEx1(){
			//this(5,"Krishh",2.22);
			System.out.println("This is Default Constructor");
		}
		
		//Parameterized Constructor 2
		ConstructorEx1(int i,String n,double a){
			System.out.println("This is Parameterized Constructor 2");
			id = i;
			name = n;
			avg = a;
		}	
		
		public void display(){
			System.out.println(id+" " + name+" " + avg);
		}
		
		
		public static void main(String[] args) {
			
			ConstructorEx1 c = new ConstructorEx1(100,"hello",20);
			c.display();

	}

}
