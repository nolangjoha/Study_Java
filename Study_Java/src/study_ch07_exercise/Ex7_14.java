package study_ch07_exercise;

class Outer {
	private int a = 0;
	static int b = 0;
	
	//인스턴스 클래스
	class InstanceInner {
		int i_a = a;
		int i_b = b;
	}

	// static 클래스
	static class StaticInner {
//		int s_a = a;
		static int s_b = b;
	}
	
	// 인스턴스 메서드
	void myMethod() {
		int c=0;
		final int C = 0;
		
		// 지역클래스
		class LocalInner {
			int l_a = a;
			int l_b = b;
			int l_c = c;
			int l_C = C; 
			
		}
	}
	
}





public class Ex7_14 {
	
}
