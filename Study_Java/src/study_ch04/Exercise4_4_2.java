package study_ch04;

public class Exercise4_4_2 {

	public static void main(String[] args) {
		
		int sum =0;
		int i = 1;
		
		for(i=1; true; i++) {
			if(i%2 == 0) {
				sum += (-i);
			}else {
				sum += i;
			}
			
			if(sum>= 100) break;
		}
		
		System.out.println(i);
		System.out.println(sum);
		
		
	}
	
}
