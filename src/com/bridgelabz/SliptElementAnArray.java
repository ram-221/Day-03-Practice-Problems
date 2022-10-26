package com.bridgelabz;

import java.util.Arrays;

public class SliptElementAnArray {

	public static void main(String[] args) {

		int array[] = {2,4,6,8,10,12};
		int find = array.length;
		int array1[] = new int[(find +1)/2];
		int array2[] = new int[find-array1.length];

		for(int i=0;i<find;i++) {
			if(i<array1.length) {
				array1[i] = array[i];
			}
			else {
				array2[i-array1.length] = array[i];
			}

		}
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
	}

}
