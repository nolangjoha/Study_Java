package study_ch05;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
	
		String[] words = {"television", "computer", "mouse", "phone"};
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<words.length; i++) {
			char[] question = words[i].toCharArray(); // String을 char[]로 변환

			for(int j=0; j<question.length; j++) {
				
				char tmp = ' ';
				int num = (int)(Math.random()*question.length);
				
				tmp = question[j];
				question[j] = question[num];
				question[num] = tmp;
			}
			
			System.out.printf("Q%d. %s의 정답을 입력하세요.>", i+1, new String(question));
			String answer = scanner.nextLine();
			
			if(words[i].equals(answer.trim()))
				System.out.printf("정답%n%n");
			else
				System.out.printf("틀림%n%n");
		}
	}
	
}
