package com.university.test;

public class Work_1 {
	public static void main(String[] args) {
		char c = '©¤';
		char r = '©¦';
		int j;
		for (int i = 0; i < 10; i++) {
			for ( j = 0; j < 10; j++) {
				if( i == 0 || i == 9) {
					if ( i == 0 && j == 0 ) {
						System.out.print('©°');
					}
					if ( i == 0 && j == 9 ) {
						System.out.print('©´');
					}
					if ( i == 9 && j == 0 ) {
						System.out.print('©¸');
					}
					if ( i == 9 && j == 9 ) {
						System.out.print('©¼');
					}
					else if( j != 9 )
						System.out.print(c);
				}
				
			}
			if( i != 0 && i != 9)
				System.out.print(r);
				for (int j2 = 0; j2 < 9; j2++) {
					System.out.print(' ');
				}
			if( i != 0 && i != 9)
				System.out.print(r);
			System.out.println();
		}
	}
}
