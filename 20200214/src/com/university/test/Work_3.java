package com.university.test;

public class Work_3 {
	public static void main(String[] args) {
		int j;
		for (int i = 0; i < 11; i++) {
			for (j = 0; j < 11; j++) {
				if (i == 0 || i == 10) {
					System.out.print("* ");
				} else if (j == 0 || j == 10) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
