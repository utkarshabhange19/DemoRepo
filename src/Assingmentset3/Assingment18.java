package Assingmentset3;

import java.util.StringTokenizer;

public class Assingment18 {

	public static void main(String[] args) {

		String a = "a very fine day";

		StringBuffer sb = new StringBuffer();

		StringTokenizer st = new StringTokenizer(a, " ");

		while (st.hasMoreTokens()) {
			String s1 = st.nextToken();

			String s2 = s1.substring(0, 1);

			String s3 = s1.substring(1, s1.length());

			sb.append(s2.toUpperCase()).append(s3).append(" ");

		}

		System.out.println(sb);

	}

}
