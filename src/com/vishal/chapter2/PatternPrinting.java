package com.vishal.chapter2;

public class PatternPrinting {
	public static void main(String[] args) {
		
		for(int i=0;i<=5;i++) {
			for(int k=5-i;k>=1;k--) {
				System.out.print("");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	} 
	
}
