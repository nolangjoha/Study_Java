package study_ch07;

public class Ex7_13 {
	
	//내부 클래스
	class InstanceInner {}
	
	// static 내부클래스
	static class StaticInner {}
	
	
	InstanceInner iv = new InstanceInner();
	static StaticInner cv = new StaticInner();
	
	static void staticMethod() {
//		InstanceInner obj1 = new InstanceInner(); 	//객체 없이 접근 불가
		StaticInner obj2 = new StaticInner();

		// Ex7_13객체 생성해서 InstanceInner접근
		Ex7_13 outer = new Ex7_13();
		InstanceInner obj1 = outer.new InstanceInner();
	}
	
	
	void instanceMethod() {
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
//		LocalInner lv = new LocalInner();
	}
	
	void myMethod() {
		// 지역클래스
		class LocalInner {}
		LocalInner lv = new LocalInner();
	}
	
}
