package Study_ch02;

public class Ex2_9_printf {
	public static void main(String[] args) {
		String url = "www.codechobo.com";
		
		float f1 = .10f;
		float f2 = 1e1f;
		float f3 = 3.14e3f;
		
		double d = 1.23456789;
		
		System.out.printf("f1 = %f, %e, %g%n", f1, f1, f1);     // "%f" : 부동소수점 방식으로 출력, 주로 쓰임, 소수점 아래 6자리 까지만 출력(7자리에서 반올림)
		System.out.printf("f2 = %f, %e, %g%n", f2, f2, f2);		// "%e" : 지수 형태로 출력
		System.out.printf("f3 = %f, %e, %g%n", f3, f3, f3);     // "%g" : 값을 간략하게 표현할때
																// "%n" : 줄바꿈
		System.out.println("------------");
		System.out.printf("d=%f%n", d);							//  소수점7자리에서 반올림되서 1.234568로 출력
		System.out.printf("d=%14.10f%n", d);					// "%14.10f" : 14는 전체자리, 10은 소수점 아래자리. 즉, 전체 14자리 중에서 소수점 아래 10자리
		System.out.printf("d=%014.10f%n", d);					// "%014.10f" : 앞자리에 014로 표기하여 양쪽 빈자리 모두가 0으로 채워짐.
		System.out.println("------------");
		System.out.printf("[12345678901234567890]%n");
		System.out.println("------------");
		System.out.printf("[%s]%n", url);						// "%s" : 문자열 형태로 출력. 문자열의 길이만큼 출력공간 확보 
		System.out.printf("[%20s]%n", url);						// 최소 20글자 출력공간 확보(우측정렬)   기본적으로 우측정렬
		System.out.printf("[%-20s]%n", url);					// 최소 20글자 출력공간 확보(좌측정렬)   "-"를 붙이면 좌측정렬 가능
		System.out.printf("[%.8s]%n", url);						// 왼쪽에서 8글자만 출력              "."을 붙이면 문자열의 일부만 출력.
																// 지정된 숫자보다 문자열의 길이가 작으면 빈자리는 공백으로 출
		
		
		
	}
	
	
}
