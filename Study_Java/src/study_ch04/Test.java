package study_ch04;

public class Test {

	public static void main(String[] args) {
		
		int i = 0;
		int sum = 0;

		while(sum < 100) {
			i++;
			if(i%2 == 0) {  // 짝수
				sum += -i;
			} else {
				sum += i;
			}
		}
		
//		for(i=1; sum < 100; i++) {
//			if(i%2 == 0) {
//				sum+= -i;
//			}else {
//				sum += i;
//			}
//			if(sum >= 100) break;
//		}
		
		System.out.println("i값:" + i);
		System.out.println("sum값: " +sum);

		
	}
	
	
}
