package chap02;

import java.util.Scanner;

public class ReverseArrayEx_02_02 {
	
	public static void swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}
	
	// 역순 정렬
	public static void reverse(int[] a) {
		arrPrint(a);
		for(int i=0; i<a.length/2; i++) {
			System.out.println("a["+i+"]과 a["+(a.length-1-i)+"]를 교환합니다.");
			swap(a, i, a.length-1-i);
			arrPrint(a);
		}
	}
	
	public static void arrPrint(int[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
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
		reverse(a);
		System.out.println("역순 정렬을 마쳤습니다.");
	}
	
}
