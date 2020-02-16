package com.university.test;

import java.util.Arrays;
//import java.util.SortedMap;

public class Work_5 {
	public static void main(String[] args) {
		int[] arr1 = {1,7,9,11,13,15,17,19};
		int[] arr2 = {2,4,6,8,10};
		int n = arr1.length + arr2.length;
		int[] arr3 = new int[n];
//		int c = 0;
//		for (int i = 0; i < arr3.length; i++) {
//			if( i <= arr1.length -1 )
//			{
//				arr3[i] = arr1[i];
//			}
//			else 
//			{
//				
//				arr3[i] = arr2[c++];
//			}
//		}
		System.arraycopy(arr1, 0, arr3, 0, arr1.length);
		System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
		Arrays.sort(arr3);
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i]+" ");
		}
	}
}
