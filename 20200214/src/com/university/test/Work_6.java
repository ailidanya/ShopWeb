package com.university.test;

public class Work_6 {
	public static void main(String[] args) {
		int b,s,g;
		for (int i = 100; i <= 999; i++) {
			g = i % 10;
			s =( i / 10 ) % 10;
			b =( i / 100 ) %10;
			if( i == g * g *g + s * s *s + b * b * b ) {
				System.out.println(i);
			}	
		}
	}
}
