package com.university.test;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		System.out.print("��������������");
		Scanner sca = new Scanner(System.in);
		int week = sca.nextInt();
		switch (week) {
		case 1:
			System.out.println("����һ");
			break;
		case 2:
			System.out.println("���ڶ�");
			break;
		case 3:
			System.out.println("������");
			break;
		case 4:
			System.out.println("������");
			break;
		case 5:
			System.out.println("������");
			break;
		case 6:
			System.out.println("������");
			break;
		case 7:
			System.out.println("������");
			break;
		default:
			System.out.println("������󣬳��������");
			sca.close();
		}
	}
}
