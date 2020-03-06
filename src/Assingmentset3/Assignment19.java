package Assingmentset3;

public class Assignment19 {

	public static void main(String[] args) {

		String input = "Bhavanee is a good girl";

		int maxlength = 0;

		int count = 0;

		String s1 = new String();

		String[] iarray = input.split(" ");

		for (int i = 0; i < iarray.length; i++) {
			if (iarray[i].length() >= maxlength) {
				maxlength = iarray[i].length();
				s1 = iarray[i];
			}

		}
		System.out.println(s1);
		System.out.println(maxlength);

		for (int j = 0; j < s1.length(); j++) {
			char ch = s1.charAt(j);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				count++;
			}
		}

		System.out.println(count);

	}

}
