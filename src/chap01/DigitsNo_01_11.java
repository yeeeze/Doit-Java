package chap01;

import java.util.Scanner;

public class DigitsNo_01_11 {

	// 숫자의 자리수 구하는 알고리즘 : 10으로 나눈다.
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int n;
		do {
			System.out.print("양의 정수를 입력하세요. : ");
			n = scn.nextInt();
		} while (n <= 0);
		
		int length = 0;
		while(n > 0) {
			n/=10;
			length++;
		}
		
		System.out.println("그 수는 "+length+"자리입니다.");
	}
}
