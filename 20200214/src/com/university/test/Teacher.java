package com.university.test;

import java.util.Arrays;
import java.util.Scanner;

public class Teacher {

	/**
	 * ����
	 */
	public static void main(String[] args) {
		// ����
		// һ���������ͷ���һ��
		int[] nums = {
				1,2,3,4,5
		};
		//System.out.println(nums[5]);   // ����Խ���쳣  ����ʱ����
		
		
		int[] nums2 = new int[4];
		int[] nums3 = new int[] {
				100,55,99,55,11
		};
		
		
		// "��"ֵ������0(����)��0.0(������)�� \u0000(char)��false(boolean)��null(��������)
		char c = '\u0000'; 
		System.out.println(c);
		// ���ȹ̶� �±��0��ʼ ���� ����Ψһ
		
		System.out.println(nums3[2]);
		
		// ѭ��
		// ArrayIndexOutOfBoundsException�����±�Խ���쳣
		// System.out.println(nums3.length);
		// ������ = ����ֵ
//		for(int i=0;i<nums3.length;i++) {
//			System.out.print(nums3[i]);
//		}
		
		
		
		// ��������
//		int[] arrays = {
//				999,888,777,666,555
//		};
//		int[] arrays2 = arrays;
//		// ��������
//		arrays[4] = 1000;
//		for(int i=0;i<arrays2.length;i++) {
//			System.out.println(arrays2[i]);
//		}
		// ���
		int[] arrays = {
				999,888,777,666,555
		};
		int[] arrays2 = new int[arrays.length];
		for(int i=0;i<arrays.length;i++) {
			arrays2[i] = arrays[i];
		}
	    // ���arrays2��Ԫ������
		// ԭ����arrays ��arrays2 ��Ԫ������
		System.out.println("arrays1"+Arrays.toString(arrays));
		System.out.println("arrays2"+Arrays.toString(arrays2));
		
		arrays[0] = 1000;
		System.out.println("�޸ĺ���������������");
		System.out.println("arrays1"+Arrays.toString(arrays));
		System.out.println("arrays2"+Arrays.toString(arrays2));
		
		// ��ϰ 2��ͳ��һ���ַ����ַ������е�����λ��
		char[] charArrays = {
				'��','��','��','��','��','��','��','��'
		};
		Scanner scanner = new Scanner(System.in);
		System.out.println("����Ҫ���ҵ��ַ�:");
		String str = scanner.next();
		for(int i=0;i<charArrays.length;i++) {
			if(str.charAt(0) == charArrays[i]) {
				System.out.println(str+"������"+i+"λ����");
			}
		}
		
		
		
		// charAt() jdk��һ������
//		String str2 = "helloworld";
//		char charAt = str2.charAt(0);
//		System.out.println(charAt);
		
		
		
		// int[] nums = {1,2,3,4,5,6}
		// ��������,��һ��Ԫ����ô��?
		// �ֶ�ʵ����������
//		int[] numss = {1,2,3,4,5,6};
//		int[] newArray = new int[numss.length+1];
//		for(int i=0;i<numss.length;i++) {
//			newArray[i] = numss[i];
//		}
//		newArray[newArray.length-1] = 100;
//		System.out.println(Arrays.toString(newArray));
//		
		
		// ��һ�����鸴��API
		int[] numss = {1,2,3,4,5,6};
		int[] destArray = new int[numss.length];
//		System.arraycopy(numss, 0, destArray, 0, numss.length);
//		System.out.println(Arrays.toString(destArray));
		// �ڶ���
		int[] copyOf = Arrays.copyOf(numss, numss.length);
		System.out.println(Arrays.toString(copyOf));
		// �������ҽ��Ŀ�ѡ���Զ�
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}