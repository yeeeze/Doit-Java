package chap01;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		if(n==1) System.out.println("1입니다.");
		else if(n==2) System.out.println("2입니다.");
		else System.out.println("3입니다.");
	}

}
