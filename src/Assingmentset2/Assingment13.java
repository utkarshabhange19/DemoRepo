package Assingmentset2;

import java.util.StringTokenizer;

public class Assingment13 {

	public static void main(String[] args) {

		String input1 = "hai hello hai where hai Hai";
		String input2 = "what hai";

		int count = 0;

		StringTokenizer t1 = new StringTokenizer(input2, " ");

		String s1 = t1.nextToken();

		String s2 = t1.nextToken();

		StringTokenizer t2 = new StringTokenizer(input1, " ");

		while (t2.hasMoreTokens()) {
			if (t2.nextToken().equals(s2)) {
				count++;
			}
		}

		System.out.println(count);

	}

}
