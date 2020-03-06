package Assingmentset3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Assingment17 {

	public static void main(String[] args) {

		String[] array = { "red", "green", "blue", "ivory" };
		int n = 1;

		String s1 = "";

		List<String> l = new ArrayList<String>();

		for (int i = 0; i < array.length; i++) {
			l.add(array[i]);

		}

		Collections.sort(l, Collections.reverseOrder());
		

		for (int i = 0; i < l.size(); i++) {
			if (i == (n - 1)) {
				s1 = l.get(i);
			}
		}
		System.out.println(s1);

	}

}
