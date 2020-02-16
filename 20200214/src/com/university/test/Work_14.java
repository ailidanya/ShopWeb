package com.university.test;
//百元买鸡
public class Work_14 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i <= 20; i++) {
			for (int j = 0; j < 34; j++) {
				for (int j2 = 0; j2 <= 100; j2++) {
					if ( i * 5 + j * 3 +j2 == 100 ) {
						System.out.println("买了"+i+"只公鸡"+j+"只母鸡"+j2 * 3+"只小鸡");
						count++;
					}
				}
			}
		}
		System.out.println("共有"+count+"种组合方法");
	}
}
