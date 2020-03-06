package Assingmentset2;

public class Assingment14 {

	public static void main(String[] args) {

		String input1 = "aaabbbbccc";

		int count = 0;
		int n = 0;

		for (int i = 0; i < input1.length() - 1; i++) {
			if (input1.charAt(i) == input1.charAt(i + 1)) {

				count++;
			} else
				count = 0;

			if (count == 2) {
				n++;

			}

		}
		System.out.println(n);

	}

}
