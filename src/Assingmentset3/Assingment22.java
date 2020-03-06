package Assingmentset3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

public class Assingment22 {

	public static void main(String[] args) throws ParseException {

		String s = "02/2004";

		StringTokenizer st = new StringTokenizer(s, "/");

		int month = Integer.parseInt(st.nextToken());

		int year = Integer.parseInt(st.nextToken());

		switch (month) {
		case 1:

			System.out.println("jan");
			System.out.println("No. of days in month are " + 31);
			break;
		case 2:
			if (year % 4 == 0) {
				System.out.println("feb");
				System.out.println("No. of days in month are " + 29);
			} else {
				System.out.println("feb");
				System.out.println("No. of days in month are " + 28);
			}
			break;
		case 3:

			System.out.println("mar");
			System.out.println("No. of days in month are " + 31);
			break;
		case 4:

			System.out.println("apr");
			System.out.println("No. of days in month are " + 30);
			break;
		case 5:

			System.out.println("may");
			System.out.println("No. of days in month are " + 31);
			break;
		case 6:

			System.out.println("jun");
			System.out.println("No. of days in month are " + 30);
			break;
		case 7:

			System.out.println("jul");
			System.out.println("No. of days in month are " + 31);
			break;
		case 8:

			System.out.println("aug");
			System.out.println("No. of days in month are " + 31);
			break;
		case 9:

			System.out.println("sep");
			System.out.println("No. of days in month are " + 30);
			break;
		case 10:

			System.out.println("oct");
			System.out.println("No. of days in month are " + 31);
			break;
		case 11:

			System.out.println("nov");
			System.out.println("No. of days in month are " + 30);
			break;
		case 12:

			System.out.println("dec");
			System.out.println("No. of days in month are " + 31);
			break;

		}
	}

}
