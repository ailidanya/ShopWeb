package com.university.test;

public class char_test {
	public static void main(String[] args) {
		char[] chs = { '统','计','一','个','字','符','在','字','符','串','中' };
		char ch = '字';
		for (int i = 0; i < chs.length; i++) {
			if ( chs[i] == ch ) {
				System.out.println(i+1);
			}
		}
	}

}
