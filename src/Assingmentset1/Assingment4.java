package Assingmentset1;

public class Assingment4 {

	public static void main(String[] args) {

		String input = "xyzwabcd";

		int n1 = 2;

		int n2 = 4;

		StringBuffer sb = new StringBuffer(input);

		sb.reverse();

		String Output = sb.substring(n1, (n1 + n2));

		System.out.println(Output);

	}

}
