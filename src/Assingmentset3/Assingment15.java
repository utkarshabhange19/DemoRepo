package Assingmentset3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Assingment15 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		Date d = new Date();

		Date d1 = new Date();
		d1.setYear(d.getYear() + 1);
		SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
		String s = sdf.format(d1);

		System.out.println(s);

	}

}
