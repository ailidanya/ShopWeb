package com.university.test;

public class char_test {
	public static void main(String[] args) {
		char[] chs = { 'ͳ','��','һ','��','��','��','��','��','��','��','��' };
		char ch = '��';
		for (int i = 0; i < chs.length; i++) {
			if ( chs[i] == ch ) {
				System.out.println(i+1);
			}
		}
	}

}
