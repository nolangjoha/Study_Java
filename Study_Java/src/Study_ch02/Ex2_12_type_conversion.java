package Study_ch02;

public class Ex2_12_type_conversion {

	public static void main (String[] args) {
		
		String str = "3";
		
		System.out.println(str.charAt(0) - '0');   		// 3, 문자열 > 문자
		System.out.println('3'-'0' + 1);   		   		// 4, 문자 > 숫자
		System.out.println(Integer.parseInt("3") +1);   // 4, 문자열 > 숫자
		System.out.println("3" + 1); 					// 31, 숫자 > 문자열
		System.out.println((char)(3 + '0'));	  		// 3, 숫자 > 문자
 		
		
		System.out.println("---------");
		System.out.println("1" + "2");
		System.out.println(true + "");
		System.out.println('A' + 'B');
		System.out.println('1' + 2);
		System.out.println('1' + '2');
		System.out.println('J' + "ava");
//		System.out.println(true + null);
		
		
	}
	
	
}
