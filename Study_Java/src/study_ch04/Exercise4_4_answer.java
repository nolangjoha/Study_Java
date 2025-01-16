package study_ch04;

public class Exercise4_4_answer {

	public static void main(String[] args) {
		
		int sum = 0;
		int s = 1; // 부호용 변수
		int num = 0;
		
		for(int i=1; true; i++, s=-s) {
			num = s * i;
			sum += num;
			
			if(sum >= 100)
				break;
		}
		
		System.out.println("num=" + num);
		System.out.println("sum=" + sum);
		
	}
	
	
}
