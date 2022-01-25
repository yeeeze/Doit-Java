package chap01;
import java.util.Scanner;

public class Max4 {
	
	public static int max4(int a, int b, int c, int d) {
        int max = a;

        if(b > max) {
            max = b;
        }
        if(c > max) {
            max = c;
        }
        if(d > max) {
            max = d;
        }

        return max;
    }


	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a, b, c, d;
		
		System.out.println("네 정수의 최대값을 구합니다.");
		System.out.print("a : ");
		a = scn.nextInt();
		System.out.print("b : ");
		b = scn.nextInt();
		System.out.print("c : ");
		c = scn.nextInt();
		System.out.print("d : ");
		d = scn.nextInt();
		
		int max = max4(a, b, c, d);
		System.out.println("최댓값은 "+max+"입니다.");
	}

}
