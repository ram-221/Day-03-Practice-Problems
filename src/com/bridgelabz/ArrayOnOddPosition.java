package com.bridgelabz;

public class ArrayOnOddPosition {

	public static void main(String arg[]) {
		
		int array[] =  {1,2,3,4,5,6,7,8,9,10,11,12};
		
		for (int index = 0; index<array.length; index++) {
			System.out.print(array[index]+" ");
		}
		System.out.println();
		System.out.println("Array On Even Position");
		for(int index = 0; index<array.length; index = index+2) {
			System.out.print(array[index]+" ");
		}
	}

}
