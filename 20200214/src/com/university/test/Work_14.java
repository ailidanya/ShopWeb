package com.university.test;
//��Ԫ��
public class Work_14 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i <= 20; i++) {
			for (int j = 0; j < 34; j++) {
				for (int j2 = 0; j2 <= 100; j2++) {
					if ( i * 5 + j * 3 +j2 == 100 ) {
						System.out.println("����"+i+"ֻ����"+j+"ֻĸ��"+j2 * 3+"ֻС��");
						count++;
					}
				}
			}
		}
		System.out.println("����"+count+"����Ϸ���");
	}
}
