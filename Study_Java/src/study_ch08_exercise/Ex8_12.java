package study_ch08_exercise;

public class Ex8_12 {

	public static void main(String[] args) {
		
		try {
			method1();
		} catch (Exception e) {
			System.out.println("main메서드에서 예외가 처리되었습니다.");
			
		}
		
	}

	static void method1() throws Exception {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("method1메서드 에서 예외가 처리되었습니다.");
			throw e;
		}
	}
	
}
