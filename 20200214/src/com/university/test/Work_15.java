package com.university.test;
//����
import java.util.Scanner;

public class Work_15 {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.print("�������·ݣ�");
		
		int num = sca.nextInt();
		int s = 2;
		for (int i = 0; i < num / 3; i++) {
			s = s * 2;
		}
		System.out.println(num+"���¹�������"+s+"ֻ");
		sca.close();
	}
}
