package Assingmentset2;

public class Assingment8 {

	public static void main(String[] args) {

		//String[] input = { "123", "23.14", "522" };
		String[] input1 = { "67d", "123", "42.20" };
		System.out.println(StringDigit(input1));

	}

	private static int StringDigit(String[] input1) {
		int n = 0;
		for (int i = 0; i < input1.length; i++) {
			String s1 = input1[i];
			for (int j = 0; j < s1.length(); j++) {
				char c1 = s1.charAt(j);
				if (Character.isDigit(c1))
					n = 1;
				else {
					n = -1;
					break;
				}
			}
		}
		return n;

	}

}
