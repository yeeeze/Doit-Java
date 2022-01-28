package chap02;

import java.util.Scanner;
import java.util.Random;

public class Random_02_01 {
	// 배열 a의 최댓값을 구하여 반환
	public static int maxOf(int[] a) {
		int max = a[0];
		
		for(int i=1; i<a.length; i++) {
			if(max < a[i]) {
				max = a[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Random rd = new Random();
		
		int pepole = rd.nextInt(10) + 1;	// 1~10까지의 난수 생성
		System.out.println("사람 수는 "+pepole);
		int[] height = new int[pepole];
		
		for(int i=0; i<pepole; i++) {
			height[i] = rd.nextInt(90) + 100; 
			System.out.println("height["+i+"] : "+height[i]);
		}
		System.out.println("가장 큰 키는 : "+maxOf(height));		
	}

}
