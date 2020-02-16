package com.university.test;
//反弹球
public class Work_12 {
	public static void main(String[] args) {
		double temp = 0 ,sum = 0;
		double height = 100;
		
		for (int i = 0; i < 10; i++) {
			sum = sum + height + temp;
			height = height / 2;
			temp = height;
		}
		System.out.println("共经过"+sum+"米");
		System.out.println("反弹了"+height+"米");
	}

}
