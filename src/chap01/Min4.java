package chap01;

import java.util.Scanner;

public class Min4 {

	static int min4(int a, int b, int  c, int d) {
		int min = a;
		
		if(b < min) {
			min = b;
		}
		if(c < min) {
			min = c;
		}
		if(d < min) {
			min = d;
		}
		
		return min;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a, b, c, d;
		
		System.out.println("정수의 최솟값을 구합니다.");
		System.out.print("a : ");
		a = scn.nextInt();
		System.out.print("b : ");
		b = scn.nextInt();
		System.out.print("c : ");
		c = scn.nextInt();
		System.out.print("d : ");
		d = scn.nextInt();
		
		int min = min4(a, b, c, d);
		
		System.out.println("최솟값은 "+min+"입니다.");
	}

}
