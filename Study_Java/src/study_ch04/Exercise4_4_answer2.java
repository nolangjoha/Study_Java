package study_ch04;

public class Exercise4_4_answer2 {

	public static void main(String[] args) {
		
		int sum = 0;
		int s = 1; // 부호용 변수
		int num = 0;
		int i = 1;
		
		for(i=1; sum<100; i++, s=-s) {
			num = s * i;
			sum += num;
		}
		
		System.out.println("num=" + num);
		System.out.println("sum=" + sum);
		System.out.println("i= " + i);
		
	}
	
	
}
