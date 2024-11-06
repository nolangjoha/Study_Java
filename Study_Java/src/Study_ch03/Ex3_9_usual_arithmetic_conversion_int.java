package Study_ch03;

public class Ex3_9_usual_arithmetic_conversion_int {

	// [산술변환] long형으로 형변환 되어도 값은 제대로 안나온다. int 계산에서 오버플로우 발생
	public static void main(String args[]) {
			
		int a = 1_000_000;  //jdk 1.7부터 정수형 리터럴의 중간에 구분자'_'를 넣을 수 있다.
		int b =  2_000_000;
		
		long c = a * b; 	// a * b = 2,000,000,000,000(2조) ?   // 오버플로우
							// int는 약20억까지만 저장할 수 있다.

		long d = (long)a * b; // 자동형변환
		
		System.out.println(c);
		System.out.println(d);
		
		
	}
		
	
	
	
}
