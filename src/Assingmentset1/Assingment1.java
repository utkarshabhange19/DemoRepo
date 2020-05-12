package Assingmentset1;

import java.util.Scanner;

public class Assingment1 {

	public static void main(String[] args) {

		// String s1 = "New York";
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the First String");
		String s1 = s.nextLine();

	//	String s2 = "NWYR";

		System.out.println("Enter the Second String");
		
	//Scanner s8 = new Scanner(System.in);
	
		String s2 = s.nextLine();
		System.out.println(s2);
		StringBuffer sb = new StringBuffer();

		String s3 = s1.toUpperCase();

		for (int i = 0; i < s2.length(); i++) {
			for (int j = 0; j < s3.length(); j++) {

				if (s2.charAt(i) == s3.charAt(j)) {

					sb.append(s1.charAt(j)).append('+');

					
				}

			}

		}

		System.out.println(sb.toString());
		System.out.println("Hello World");
	}

}
