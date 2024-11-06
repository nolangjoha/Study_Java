package Study_ch03;

public class Ex3_10_usual_arithmetic_conversion_long {

	// [산술변환] 
	public static void main(String args[]) {
			
		long a = 1_000_000 * 1_000_000;  
		long b =  1_000_000L * 1_000_000L ;
		
		System.out.println("a=" + a);  // int형 리터럴로 계산된 값도 int형이다.
		System.out.println("b=" + b);
		
		
		
	}
		
	
	
	
}
