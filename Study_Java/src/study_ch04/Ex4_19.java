package study_ch04;

public class Ex4_19 {

	public static void main(String[] args) {
		
		
		Loop1 : for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				if(j==5)
//					break Loop1;		// 2단의 4번째 곱까지만 출력
//					break;				// 2단~ 9단까지 4번째 곱까지만 출력 + 단 사이에 간격 있음
//					continue Loop1; 	// 2단~ 9단까지 4번째 곱까지만 출력 + 단 사이에 간격 없음
					continue;			// 2단~ 9단까지 5번째 곱만 빼고 모두 출력(단 사이에 간격 있음)
				System.out.println(i+ "*" + j + "=" + i*j);				
			}
			System.out.println();
		}
	}
	
}
