package com.university.test;
//ÍêÊý
public class Work_11 {
	public static void main(String[] args) {
		int temp = 0;
		
		for (int i = 2; i <= 1000; i++) {
			temp = 0;
			for (int j = 2; j < i; j++) {
				if ( i / j * j == i ) {
					if( i / j > j )
						temp = temp + j + i / j;
					else if ( i / j == j ) {
						temp = temp + j;
					}
					else {
						break;
					}
				}
			}
			if ( temp+1 == i ) {
				System.out.println(i);
			}
		}
	}
}
