package study_ch10;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exercise10_1 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		cal.set(2020, 0, 1);
		
		for(int i=0; i<12; i++) {
			int weekday = cal.get(Calendar.DAY_OF_WEEK);	//1일의 요일
			 
			int secondSunday = (weekday==1) ? 8 : 16-weekday;  // 2번째 일요일의 날짜
			
			cal.set(Calendar.DAY_OF_MONTH, secondSunday); // 2번째 일요일로 날짜 변경
			
			Date d = cal.getTime();		// Date로 변환
			System.out.println(new SimpleDateFormat("yyyy-MM-dd은 F번째 E요일 입니다.").format(d));
			
			
			cal.add(Calendar.MONTH, 1); // 월에 1 더해서 다음달로 변경
			cal.set(Calendar.DAY_OF_MONTH, 1); // 1일로 다시 설정
		}
		
	}
}
