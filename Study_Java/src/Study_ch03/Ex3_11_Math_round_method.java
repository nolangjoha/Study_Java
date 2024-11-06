package Study_ch03;

public class Ex3_11_Math_round_method {

	// [반올림] Math.round()메서드 : 소수 첫째자리에서 반올림 한 결과를 정수로 반환 
	public static void main(String args[]) {
		
		double pi = 3.141592;
		double shortPi = Math.round(pi * 1000) / 1000.0;  //  3142/1000.0
		
		
		
		System.out.println(shortPi);
		
		
		
		
	}
}
