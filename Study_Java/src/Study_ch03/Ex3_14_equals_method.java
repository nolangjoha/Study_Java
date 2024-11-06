package Study_ch03;

public class Ex3_14_equals_method {

	//[문자열의 비교] equals() 메서드:서로다른 객체여도 내용이 일치하면 true, equalsIgnoreCase()메서드: 대소문자 구별 없이 문자열 비교하고 싶을떄 사용 
	public static void main(String args[]) {
		
		String str1 = "abc";
		String str2 = new String("abc");
		
		System.out.printf("\"abc\" == \"abc\" ? %b%n", "abc"=="abc");
		System.out.printf(" str1 == \"abc\" ? %b%n", str1 == "abc");
		System.out.printf(" str2 == \"abc\" ? %b%n", str2 == "abc");
		System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
		System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
		System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));
		
	}
	
	
}
