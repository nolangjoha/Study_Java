package study_ch07_exercise;


public class Ex7_13 {

	
	class InstanceInner {}	// 1)인스턴스 클래스
	static class StaticInner { // 2)static 클래스
		void method() {}	
	}	 
	
	InstanceInner iv = new InstanceInner();  // 인스턴스 참조변수
	static StaticInner cv = new StaticInner();  //static 참조변수
	StaticInner cv2 = new StaticInner();  //인스턴스 참조변수
	
	// static 메서드
	static void staticMethod() {
		StaticInner ojb2 = new StaticInner();

		//static메서드내에서 인스턴스 클래스 객체를 만드려면  외부 클래스를 먼저 생성해야함.
	  //InstanceInner obj1 = new InstanceInner();
		Ex7_13 outer = new Ex7_13();
		InstanceInner obj1 = outer.new InstanceInner();
		
		cv.method();
//		cv2.method();
		outer.cv2.method();
	}
	
	//인스턴스 메서드
	void instanceMethod() {
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		
		cv.method();
		cv2.method();
	}
	
	// 인스턴스 메서드
	void myMethod() {
		// 3)지역클래스
		class LocalInner{}
		LocalInner lv = new LocalInner();
	}


}

