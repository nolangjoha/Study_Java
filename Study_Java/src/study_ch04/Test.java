package study_ch04;

public class Test {

	public static void main(String[] args) {
	
		int num = 12345;
		int sum = 0;
		
		while(num>0) {
			sum += num%10;
			num /= 10;
		}
		
		System.out.println(num);
		System.out.println(sum);
		
	}
}
