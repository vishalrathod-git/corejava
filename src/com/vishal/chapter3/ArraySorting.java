package com.vishal.chapter3;

import java.util.Arrays;

public class ArraySorting {
	
	public static void main(String[] args) {

		int arr[]= {3,5,1,6,2,7,9};
		int sum=8;
		for (int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if (arr[i]+arr[j]==sum) {
					System.out.println(arr[i]+"+"+arr[j]+"="+sum);
				}
			}
		}
		
		
		
		/*
		 * int arr[]= {5,8,2,6,9,3}; int temp=0; for(int i=0;i<arr.length;i++) { for(int
		 * j=i+1;j<arr.length;j++) {
		 * 
		 * if(arr[i]>arr[j]) { temp=arr[i]; arr[i]=arr[j]; arr[j]=temp; }
		 * System.out.println(Arrays.toString(arr)); } }
		 */
	}
}