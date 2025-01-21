package study_ch06;

public class Exercise6_21 {

	static int abs(int x) {
		if(x<0) {
			x= -x;
		}else if(x>0) {
			x = x;
		} else if(x == 0) {
			x =0;
		}
		return x;
	}
	
	static int abs2(int x) {
		x = (x < 0 ? -x : (x == 0 ? 0 : x));
		return x;
	}
	
	static int abs3(int x) {
		return x >= 0 ? x : -x;
	}
	
	public static void main(String[] args) {
		
		System.out.println("<abs메서드>");
		int value = 1;
		System.out.println(value + "의 절대값: " + abs(value));

		value = -2;
		System.out.println(value + "의 절대값: " + abs(value));
		
		value = 0;
		System.out.println(value + "의 절대값: " + abs(value));
		
		System.out.println("===============");
		System.out.println("<abs2 메서드>");

		value = 3;
		System.out.println(value + "의 절대값: " + abs2(value));
		
		value = -4;
		System.out.println(value + "의 절대값: " + abs2(value));
	
		value = 0;
		System.out.println(value + "의 절대값: " + abs2(value));
	
		System.out.println("===============");
		System.out.println("<abs3 메서드>");

		value = 5;
		System.out.println(value + "의 절대값: " + abs2(value));
		
		value = -6;
		System.out.println(value + "의 절대값: " + abs2(value));
	
		value = 0;
		System.out.println(value + "의 절대값: " + abs2(value));
	}
	
	
	
}
