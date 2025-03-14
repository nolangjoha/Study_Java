package study_ch10;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Exercise10_2 {
	public static void main(String[] args) {
		
		String pattern = "yyyy/MM/dd";
		DateFormat df = new SimpleDateFormat(pattern);
		Scanner s = new Scanner(System.in);
		
		Date inDate = null;
		
		
		System.out.println("날짜를 " + pattern + "의 형태로 입력해주세요. (입력예 : 2019/12/31)");
		
		while(s.hasNextLine()) {
			try {
				System.out.print(">>");
				inDate = df.parse(s.nextLine());
				break;
			} catch (ParseException e) {
				System.out.println("날짜를 " + pattern + "의 형태로 입력해주세요. (입력예 : 2019/12/31)");
			}
		}
		
		System.out.println("입력하신 날짜는 " + new SimpleDateFormat("E").format(inDate) + "요일 입니다.");
		
		
	}
}
