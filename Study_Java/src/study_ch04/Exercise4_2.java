package study_ch04;

public class Exercise4_2 {

	public static void main(String[] args) {
		
		int i = 0;
		int sum = 0;
		
		for(i=1; i<=20; i++) {
			if(!(i % 2 == 0 || i % 3 == 0)) {
				sum += i;
				
			}
		}
		
		System.out.println("합계: " + sum);
		
	}
	
	
}
