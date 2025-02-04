package study_ch07;

class Outer {
	
	private int outerIv = 0;
	static int outerCv = 0;
	
	// 외브 클래스의 인스턴스 클래스
	class InstanceInner {
		int iiv = outerIv;
		int iiv2 = outerCv;
	}
	
	static class StaticInner {
//		int siv = outerIv; // 스태틱클래스틑 외부 클래스의 인스턴스 멤버에 접근 불가
//		Outer outer = new Outer();
//		int siv = outer.outerIv;
		
		static int scv = outerCv;
	}
	
	void myMethod() {
		int lv = 0;
		final int LV = 0;
		
		// 지역클래스
		class LocalInner {
			int liv = outerIv;
			int liv2 = outerCv;
			int liv3 = lv;
			int liv4 = LV;
		}
	}
	
	
}

public class Ex7_14 {

}
