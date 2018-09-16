package com.polymorphism;

public class PolyEx {
	
	//Overloading
	
	static int add(int a, int b){
		return a+b;
	}
	
	static float add(float a, float b,float c){
		return a+b+c;
	}
	

	public static void main(String[] args) {
		System.out.println(PolyEx.add(10, 20));
		System.out.println(PolyEx.add(10, 20,20));
	}

}
