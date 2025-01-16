package study_ch04;

public class Exercise4_1 {

	public static void main(String[] args) {
		
		
		// 1) int형 변수 x가 10보다 크고 20보다 작을때 true인 조건식
		int x = 15;
		if( 10 < x && x <20) {
			System.out.println("1번 : true");
		} else {
			System.out.println("1번 : false");
		}

		
		// 2) char형 변수가 ch가 공백이거나 탭이 아닐때 true인 조건식
		char ch = 'a';
		if(!(ch == ' ' || ch == '\t')) {
			System.out.println("2번 : ture");
		} else {
			System.out.println("2번 : false");
		}
		
		// 3) char형 변수 ch2가 'x'또는 'X'일때, true인 조건식
		char ch2 = 'x';
		if(ch2 == 'x' || ch2 == 'X') {
			System.out.println("3번 : ture");
		} else {
			System.out.println("3번 : false");
		}
		
		
		// 4) char형 변수 ch3이 숫자('0'~'9')일때 true인 조건식
		char ch3 = 'a';
//		System.out.println(ch3 + 1); //0이 48, 9가 57
//		if(48 <= ch3 && ch3 <= 57) {
		if('0' <= ch3 && ch3 <= '9') {
			System.out.println("4번 : true");
		} else {
			System.out.println("4번 : false");
		}
		
		// 5) char형 변수 ch4가 영문자(대문자 또는 소문자)일 때 true인 조건식
		char ch4 = 'g';
//		System.out.println(ch4 +1); //'a'=97, 'z'=122, 'A'=65, 'Z' = 90
//		if((65 <= ch4 && ch4 <= 90)||(97 <= ch4 && ch4 <= 122)) {
		if(('A' <= ch4 && ch4 <= 'Z')||('a' <= ch4 && ch4 <= 'z')) {
			System.out.println("5번 : true");
		} else {
			System.out.println("5번 : false");
		}
		
		// 6) int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지 않을때 true인 조건식
		int year = 57;
		if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			System.out.println("6번 : true");
		} else {
			System.out.println("6번 : false");
		}
		
		// 7) boolean형 변수 powerOn이 false일때 true인 조건식
		boolean powerOn = false;
		if(powerOn==false) {
			System.out.println("7번 : true");
		} else {
			System.out.println("7번 : false");
		}
		
		// 8) 문자열 참조변수 str이 "yes"일때, true인 조건식
		String str = "yes";
		if(str.equals("yes")) {
			System.out.println("8번 : true");
		} else {
			System.out.println("8번 : false");
		}
	}
	
	
}
