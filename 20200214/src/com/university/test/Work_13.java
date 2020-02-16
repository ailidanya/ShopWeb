package com.university.test;

import java.util.Scanner;

//杨辉三角
public class Work_13 {
	public static void main(String[] args) {
		int[] temp = new int[20];
		int[] temp1 = new int[20];
		temp[0] = 1;
		temp[1] = 1;
		System.out.print("请输入要打印的杨辉三角行数：");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n -i ; j++) {
				System.out.print("  ");
			}
			if( i == 0 )
				System.out.print(temp[0]+"   ");
			else if( i == 1 )
			{
				System.out.print(temp[0]+"   ");
				System.out.print(temp[1]+"   ");
			}
			else {
				temp1[0] = 1;
				temp1[i] = 1;
				for (int j = 1; j < i; j++) {
					temp1[j] = temp[j] + temp[j - 1];
				}
				int c = 0;
				while ( temp1[c] != 0 ) {
					System.out.print(temp1[c]);
					if ( temp1[c] < 10) {
						System.out.print("   ");
					}
					else if ( temp1[c] < 100) {
						System.out.print("  ");
					}
					else {
						System.out.print(" ");
					}
					c++;
				}
				for (int j = 0; j < temp1.length; j++) {
					temp[j] = temp1[j];
				}
			}
			System.out.println();
		}
		scanner.close();
	}
}
