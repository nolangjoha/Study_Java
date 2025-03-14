package study_ch10;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exercise10_4 {

	public static void main(String[] args) {
		String pattern = "yyyy-MM-dd";
		DateFormat df = new SimpleDateFormat(pattern);
		
		Calendar birth = Calendar.getInstance();
		Calendar today = Calendar.getInstance();
		
		birth.set(1995, 10, 6);
		
		Date birthDate = birth.getTime();
		Date todayDate = today.getTime();
		
		long day = (today.getTimeInMillis() - birth.getTimeInMillis())/ (24*60*60*1000);
		
		System.out.println("birth day= " + df.format(birthDate));
		System.out.println("today= " + df.format(todayDate));
		System.out.println(day +"days");
		
		
		
		
	}
	
	
}
