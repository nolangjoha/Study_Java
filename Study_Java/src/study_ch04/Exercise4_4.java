package study_ch04;

public class Exercise4_4 {

	public static void main(String[] args) {
		
		int i = 0;
		int sum = 0;
		
		while(true) {
			if(sum >= 100) {
				break;
			}
			i++;
			if(i%2 != 0) {
				sum+=i;
			}else {
				sum+=(-i);
			}
		}
		System.out.println("i : "+ i);
		System.out.println("sum: " + sum);
		
	}
	
	
	
}
