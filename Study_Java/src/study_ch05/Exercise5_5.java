package study_ch05;

import java.util.Arrays;

public class Exercise5_5 {

	public static void main(String[] args) {
		
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		
		for(int i=0; i<ballArr.length; i++) {
			int j = (int)(Math.random() * ballArr.length);
			int tmp = 0;
		
			tmp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j] = tmp;
		}

		//ball3 = Arrays.copyOfRange(ballArr, 0, 3);	// 새배열 생성 후 복사. ball3는 새로 생성된 배열의 참조 주소가 있음.
		System.arraycopy(ballArr, 0, ball3, 0, 3);		// 기존 배열에 복사. 대상 배열 미리 생성 필요.
		
		
		for(int i=0; i<ball3.length; i++) {
			System.out.print(ball3[i]);
		}
		
		
		
		
		
		
	}
	
}
