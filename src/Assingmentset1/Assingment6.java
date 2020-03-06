package Assingmentset1;

public class Assingment6 {

	public static void main(String[] args) {

		String input1 = "abc2012345";

		String input2 = "abc2112660";

		int input3 = 4;

		int output1 = Integer.parseInt(input1.substring(5));

		System.out.println(output1);

		int output2 = Integer.parseInt(input2.substring(5));

		System.out.println(output2);

		int finaloutput = (output2 - output1) * 4;
System.out.println((output2 - output1));
		
		System.out.println(finaloutput);

	}

}
