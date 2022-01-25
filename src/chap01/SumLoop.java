package chap01;

import java.util.Scanner;

public class SumLoop {
	public static int sumWhile(int n) {
		int sum = 0 ;
		int i = 1;
		while(i <= n) {
			sum += i;
			i++;
		}
		System.out.println("i값은 : "+i);
		return sum;
	}
	
	public static int sumFor(int n) {
		int sum = 0;
		
		for(int i=1; i<n+1; i++) {
			sum += i;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("n값을 입력하세요.");
		int n = scn.nextInt();
		int sum = sumWhile(n);

		System.out.println("1부터 "+n+"까지의 합 : "+sum);
	}

}
