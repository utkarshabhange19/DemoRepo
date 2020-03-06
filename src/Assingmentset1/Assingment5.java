package Assingmentset1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Assingment5 {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 5, 4, 1, 6, 7, 7, 9 };

		int sum = 0;

		List<Integer> l = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			l.add(arr[i]);

		}
		
		

		List<Integer> l2 = new ArrayList<>();
		
		

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					l2.add(arr[i]);

				}
			}
		}

		l.removeAll(l2);
		l.addAll(l2);

		for (int i = 0; i < l.size(); i++) {
			if (l.get(i) % 2 == 0) {
				sum += l.get(i);
			}
		}

		System.out.println(sum);

		if (sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println("even no.s are also present in the array");
		}

	}

}
