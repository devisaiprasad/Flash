package com.stringspack;

import java.util.Scanner;

public class CountEachStringChar {
	static String s= "ABCDABCD";
	
	public static void main(String[] args) {
		//CountEachStringChar obj = new CountEachStringChar();
		int sl = CountEachStringChar.s.length();
		System.out.println(sl);
		
		for (int i = 0; i <= sl;i++){
			int counter = 0;
			char c = CountEachStringChar.s.charAt(i);
			for (int j = 0; j <= sl; j++) {
				char ch = CountEachStringChar.s.charAt(j);
				if (c == ch){
					counter = counter +1;		
				}
				System.out.println("Count of " + c + "=" + counter);
			}
			}
			
			
		}
		
	

		
		
		

		

	}


