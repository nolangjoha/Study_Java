package Study_ch02;

public class Ex2_8_variable_Assignment {

	public static void main(String args[]) {
		int x = 10, y = 5;
		
		System.out.println("x=" + x);
		System.out.println("y=" + y);

		int tmp = x;  // x를 tmp에 저장
		x = y;        // y를 x에 저장
		y = tmp;	  // tmp를 y에 저장
		
		System.out.println("------");
		
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		 
	
	}
	
	
	
	
}
