package com.bridgelabz;

public class LargestElementArray {
	
	public static void main(String arg[]) {
		
		int array[] = new int[] {5,12,45,9,356};
		int largest = array[0];
		for (int index=0; index<array.length;index++) {
			if(array[index]>largest) 
				largest=array[index];
		}
			System.out.println("Largest element of array: "+largest);
		
	}

}
