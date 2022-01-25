package chap01;

import java.util.Scanner;

public class SumOf {

	public static int sumOf(int a, int b) {
		int start;
		int finish;
		int sum = 0;
		
		if(a<b) {
			start = a;
			finish = b;
		}
		else {
			start = b;
			finish = a;
		}
		
		for(int i=start; i <= finish; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("두개의 정수를 포함하여 사이의 모든 합을 구합니다.");
		System.out.print("첫번째 수: ");
		int a = scn.nextInt();
		System.out.print("두번째 수: ");
		int b = scn.nextInt();
		
		System.out.println(sumOf(a, b));
	}

}
