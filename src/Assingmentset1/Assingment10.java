package Assingmentset1;

public class Assingment10 {

	public static void main(String[] args) {

		int a[] = { 1, 4, 2, 1, 4, 1, 5 };

		int max = 0;

		int n = 0;

		int q1 = 0;
		int q2 = 0;

		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j]) {
					n = j;

					if (n - i > max) {
						max = n - i;

						q1 = i;
						q2 = n;
					}

				}

			}

		}

		for (int i = q1; i <= q2; i++) {

			sum = sum + a[i];

		}

		System.out.println("The largest span is " + (q2 - q1));
		System.out.println(sum);

	}

}
