package com.university.test;

public class Work_4 {
	public static void main(String[] args) {
		String str1 = "*****";
		int c = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4-i; j++) {
				System.out.print(" ");
			}
			System.out.print(str1);
			while ( c != 0 ) {
				System.out.print(" ");
				c--;
			}
			c = i*2+2;
			System.out.println("*");
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 15; j++) {
				if (i == 0 || i == 4) {
					System.out.print("*");
				} else if (j == 0 || j == 14) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
