package study_ch08_exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise8_7 {

	public static void main(String[] args) throws InputMismatchException {
		int answer = (int) (Math.random() * 100) +1;
		int input =0;
		int count =0;
		
		
		System.out.println(answer);
		
		
		do {
			 count ++;
			 System.out.println("1과 100사이의 값을 입력하세요.");
			 
			 try {
				 input = new Scanner(System.in).nextInt();
			 } catch(InputMismatchException ime) {
				 System.out.println("유효하지 않은 값입니다. 다시 값을 입력해주세요.");
				 continue;
			 }	 
			 
			 if(answer > input) {
				 System.out.println("더 큰 수를 입력하세요");
			 } else if (answer < input) {
				 System.out.println("더 작은 수를 입력하세요.");
			 } else {
				 System.out.println("맞췄습니다.");
				 System.out.println("시도 횟수는" + count + "번입니다.");
				 break;
			 }
			 
		} while(true);
		
	}
	
}
