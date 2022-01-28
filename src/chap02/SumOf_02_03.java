package chap02;

import java.util.Scanner;

public class SumOf_02_03 {
	
	public static int sumOf(int[] a) {
		int sum = 0;
		
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		
		return sum;
	}
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("배열의 길이를 입력하세요. : ");
		int num = scn.nextInt();
		int[] a = new int[num];
		
		for(int i=0; i<a.length; i++) {
			System.out.print("a["+i+"] : ");
			a[i] = scn.nextInt();
		}
		
		System.out.println(sumOf(a));
	}
}
