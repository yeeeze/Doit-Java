package chap02;

public class Copy {
	public static void copy(int[] a, int[] b) {
		a = b.clone();
	}
	
	public static void main(String[] args) {
		int[] a = new int[5];
		int[] b = new int[]{1,2,3,4,5};
		
		copy(a, b);
		
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
