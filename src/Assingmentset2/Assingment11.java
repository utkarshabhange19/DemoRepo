package Assingmentset2;

public class Assingment11 {

	public static void main(String[] args) {

		String[] input = { "a", "2", "b", "4" };

		String s = "";
		int n = 0;

		boolean b = false;

		for (int i = 0; i < input.length; i++) {
			s = input[i];

			for (int j = 0; j < s.length(); j++) {
				char c = s.charAt(j);

				if (Character.isDigit(c)) {
					b = true;
				} else {
					b = false;
					break;
				}

			}

			if (b == true) {
				n += Integer.parseInt(s);

			} else {
				n = -1;

				;
				break;
			}

		}
		System.out.println(n);
	}

}
