package Assingmentset2;

public class Asingment9 {

	public static void main(String[] args) {

		int[] a = { 12, 14, 2, 26, 35 };

		int max = 12;
		int min = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			} else {
				min = a[i];
			}

		}

		int ouptut = max - min;
		System.out.println(ouptut);

	}

}
