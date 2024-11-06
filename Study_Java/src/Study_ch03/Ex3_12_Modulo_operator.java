package Study_ch03;

public class Ex3_12_Modulo_operator {

	//[나머지 연산자]: %
	public static void main(String args[]) {
		int x = 10;
		int y = 8;
		
		System.out.printf("%d을 %d로 나누면, %n", x, y);
		System.out.printf("몫은 %d이고, 나머지는 %d입니다.%n", x / y, x % y);
		
		System.out.println("---------");
		
		// 나머지 연산의 결과에 왼쪽 피연산자의 부호를 붙이면 된다.
		System.out.println(-10%8);  // -
		System.out.println(10%-8);  // +
		System.out.println(-10%-8); // -
		
		
		
	}
	
	
}
