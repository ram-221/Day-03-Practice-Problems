package com.bridgelabz;

public class SmallestElementArray {
	
	public static void main(String args[]) {
		
		int array[] = new int[] {47,36,78,92,25};
		for(int index = 0;index < array.length; index ++) {
			System.out.print(" "+array[index]);
		}
		int smallest = array[0];
		for(int index =0; index<array.length;index++) {
			if (array[index]<smallest) 
				smallest = array[index];
			
		}
		System.out.println(" Smallest element of array: "+smallest);
	}

}
