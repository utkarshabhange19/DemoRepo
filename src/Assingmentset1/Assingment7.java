package Assingmentset1;

public class Assingment7 {

	public static void main(String[] args) {
		
	int [] input = {2,3,5};
	
	int output = 0 ;
 	
	for(int i = 0 ; i < input.length ; i++)
	{
		
		output +=(Math.pow(input[i], i));
		
		
		
	}
		
		
		System.out.println(output);

	}

}
