package com.bridgelabz;

public class DuplicateElementsOfArray {
	public static void main(String[] args) {      

		int [] arr = new int [] {6,5,8,9,4,3,6,5,2,5,2,4,1};   

		System.out.println("Duplicate elements in given array: ");  

		for(int i = 0; i < arr.length; i++) {  
			for(int j = i + 1; j < arr.length; j++) {  
				if(arr[i] == arr[j])  
					System.out.println(arr[j]);  
			}  
		}  
	}  

}
