package com.university.test;

import java.util.Scanner;

public class Work_16 {
	public static void main(String[] args) {
		System.out.print("请输入人数：");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int people = n;
		int temp = 0, i = 0;
		int[] arr = new int[n];
		while (people != 1) {
			if (arr[i % n] == 9) {
				i++;
				continue;
			}

			if (arr[i % n] == 3) {
				arr[i % n] = 9;
				i++;
				people = people - 1;
				continue;
			}

			arr[i++ % n] = temp++ % 3 + 1;
//			System.out.println("arr" + (((i - 1) % n) + 1) + "=" + arr[(i - 1) % n]);

		}
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] != 3 && arr[j] != 9) {
				System.out.println("最后留下的人是：" + (j + 1));
//				System.out.println("现在数组状态:"+arr[j]);
			}
		}
		scanner.close();
	}
}
