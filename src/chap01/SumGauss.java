package chap01;

import java.util.Scanner;

public class SumGauss {
	// 가우스의 덧셈
	public static int sumGauss(int n) {
		int sum;
		int count = n/2;
		
		// 홀수
		if(n%2 != 0) {
			sum = ((1+n)*count) + (count+1);
		}
		else {
			sum = (1+n)*count;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		System.out.println(sumGauss(n));

	}

}
