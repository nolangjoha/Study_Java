package study_ch10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exercise10_3 {

	static int paycheckCount(Calendar from, Calendar to) {
		
		
		int fromYear = from.get(Calendar.YEAR);
		int fromMonth = from.get(Calendar.MONTH);
		int fromDate = from.get(Calendar.DAY_OF_MONTH);
		
		int toYear = to.get(Calendar.YEAR);
		int toMonth = to.get(Calendar.MONTH);
		int toDate = to.get(Calendar.DAY_OF_MONTH);
		
		// 1)
		if(from == null || to == null) return 0;
		
		// 2)
		if(from.equals(to) && fromDate==21) {
			return 1;
		}
		
		//3)
		int monDiff = (toYear * 12 + toMonth) - (fromYear * 12 +fromMonth);
		
		//4)
		if(monDiff <0) return 0;
		
		//5)
		if(fromDate <= 21 && 21 <= toDate) {
			monDiff++;
		}
		
		//6)
		if(toDate < 21 && 21 < fromDate) {
			monDiff--;
		}
	
		return monDiff;
	}
	
	static void printResult(Calendar from, Calendar to) {
		Date fromDate = from.getTime();
		Date toDate = to.getTime();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.print(sdf.format(fromDate) + " ~ " + sdf.format(toDate) + ": ");		
		System.out.println(paycheckCount(from, to)); 
	}
	
	public static void main(String[] args) {
		
		Calendar fromCal = Calendar.getInstance();
		Calendar toCal = Calendar.getInstance();
		
		fromCal.set(2020, 0, 1);
		toCal.set(2020, 0, 1);
		printResult(fromCal, toCal);
		
		fromCal.set(2020, 0, 21);
		toCal.set(2020, 0, 21);
		printResult(fromCal, toCal);
		
		fromCal.set(2020, 0, 1);
		toCal.set(2020, 2, 1);
		printResult(fromCal, toCal);
		
		fromCal.set(2020, 0, 1);
		toCal.set(2020, 2, 23);
		printResult(fromCal, toCal);
		
		fromCal.set(2020, 0, 23);
		toCal.set(2020, 2, 21);
		printResult(fromCal, toCal);
		
		fromCal.set(2021, 0, 22);
		toCal.set(2020, 2, 21);
		printResult(fromCal, toCal);
		

		
		
		
	}
	
}
