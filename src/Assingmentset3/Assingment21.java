package Assingmentset3;

public class Assingment21 {

	public static void main(String[] args) {

		int[] a = { 10, 20, 30, 40, 50 };
		int even_sum = 0;
		int odd_sum = 0;

		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0) {
				even_sum = even_sum + a[i];
			} else {
				odd_sum = odd_sum + a[i];
			}
		}
System.out.println(even_sum);
System.out.println(odd_sum);
		
		
		if (even_sum == odd_sum) {
			System.out.println(1);
		} else
			System.out.println(-1);

	}

}
