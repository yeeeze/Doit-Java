package chap01;

import java.util.Scanner;

public class Difference_01_10 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a;
		int b;
		int result;

		System.out.print("a의 값: ");
		a = scn.nextInt();
		System.out.print("b의 값: ");		// 1
		b = scn.nextInt();
		
		while(b <= a) {
			System.out.println("a보다 큰 값을 입력하세요!");
			System.out.print("b의 값: ");		// 2
			b = scn.nextInt();
		}
		result = b-a;
		System.out.println("b-a는 "+result+"입니다.");		
	}
	
	// 1과 2가 중복된다. while true문에 break를 사용해서 중복을 없앨 수 있다. 
}
