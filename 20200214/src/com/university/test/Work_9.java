package com.university.test;

import java.util.Scanner;

public class Work_9 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入四位整数：");
		int[] code = new int[4]; 
		for (int i = 0; i < code.length; i++) {
			code[i] = scanner.nextInt();
		}
		for (int i = 0; i < 4; i++) {
			code[i] = ( code[i] + 5 ) % 10;
		}
		code[0] = code[0] + code[2];
		code[2] = code[0] - code[2];
		code[0] = code[0] - code[2];
		
		code[1] = code[1] + code[3];
		code[3] = code[1] - code[3];
		code[1] = code[1] - code[3];
		for (int i = 0; i < code.length; i++) {
			System.out.print(code[i]+" ");
		}
		scanner.close();
	}
}
