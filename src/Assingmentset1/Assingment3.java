package Assingmentset1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Assingment3 {

	public static void main(String[] args) throws ParseException {

		String s1 = "31/12/2018";
		String s2 = "01/01/2019";

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Date d1 = sdf.parse(s1);

		Date d2 = sdf.parse(s2);

		Calendar cal = Calendar.getInstance();

		cal.setTime(d1);

		int month1 = cal.get((Calendar.MONTH));
		int year1 = cal.get(Calendar.YEAR);

		cal.setTime(d2);

		int month2 = cal.get((Calendar.MONTH));
		int year2 = cal.get(Calendar.YEAR);

		int totalmonths = ((year2 - year1) * 12) + (month2 - month1);

		System.out.println(totalmonths);

	}

}
