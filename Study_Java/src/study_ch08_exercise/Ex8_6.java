package study_ch08_exercise;

public class Ex8_6 {

	public static void main(String[] args) {
		
		try {
			Exception e = new Exception("고의로 발생시킴");
			throw e;
		}catch(Exception e) {
			System.out.println("에러메세지: " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램 정상종료");
	}
	
}
