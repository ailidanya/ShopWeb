package com.university.test;

public class Work_8 {
	public static void main(String[] args) {
		int[] arr1 = {1,2,5,7,3,6,4,9,5,2,4,9};
//		ð������
		for (int i = 0; i < arr1.length - 2 ; i++) {
			for (int j = 0; j < arr1.length - i - 1; j++) {
				if ( arr1[j] > arr1[j+1] ) {
					arr1[j] = arr1[j] + arr1[j+1];
					arr1[j+1] = arr1[j] - arr1[j+1];
					arr1[j] = arr1[j] - arr1[j+1];
				}
			}
		}
		System.out.print("ð������");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
//		ѡ������
		for (int i = 0; i < arr1.length -1; i++) {
			for (int j = i + 1; j < arr1.length; j++) {
				if( arr1[i] > arr1[j] )
				{
					arr1[i] = arr1[i] + arr1[j];
					arr1[j] = arr1[i] - arr1[j];
					arr1[i] = arr1[i] - arr1[j];
				}
			}
		}
		System.out.print("ѡ������");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
	}
}
