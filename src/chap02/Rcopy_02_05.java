package chap02;

public class Rcopy_02_05 {
	// 배열 b의 모든 요소를 배열 a에 역순으로 복사
	public static void rcopy(int[] a, int[] b) {
		for(int i=0; i<b.length; i++) {
			a[b.length-1-i] = b[i];
		}
	}
	
	public static void main(String[] args) {
		int[] a = new int[5];
		int[] b = new int[]{1,2,3,4,5};

		rcopy(a,b);
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
	}

}
