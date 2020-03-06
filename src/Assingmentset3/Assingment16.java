package Assingmentset3;

public class Assingment16 {

	public static void main(String[] args) {

		String input = "123gif";
		int n = 0;

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);

			if (Character.isDigit(c)) {
				String s = String.valueOf(c);
				n += Integer.parseInt(s);
			}

		}

		System.out.println(n);

	}

}
