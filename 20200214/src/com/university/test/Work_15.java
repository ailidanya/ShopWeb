package com.university.test;
//兔子
import java.util.Scanner;

public class Work_15 {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.print("请输入月份：");
		
		int num = sca.nextInt();
		int s = 2;
		for (int i = 0; i < num / 3; i++) {
			s = s * 2;
		}
		System.out.println(num+"个月共有兔子"+s+"只");
		sca.close();
	}
}
