package Assingmentset2;

public class Assingment12 {

	public static void main(String[] args) {

		int[] arraylist1 = { 1, 2, 3, 4, 5 };
		int[] arraylist2 = { 6, 7, 8, 9, 10 };

		int[] output = new int[arraylist1.length];

		for (int i = 0; i < arraylist1.length; i++) {

			for (int j = 0; j < arraylist2.length; j++) {

				if (j % 2 == 0) {
					output[j] = arraylist2[j];
				} else if (i % 2 != 0) {
					output[i] = arraylist1[i];
				}

			}
		}

		/*for (int p : output) {
			System.out.println(p);*/
		for(int z =0 ; z< output.length ; z++ )
		{
			System.out.println(output[z]);
		
		}

	}

}
