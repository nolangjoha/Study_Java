package study_ch07_exercise;

public class Ex7_17 {

	Object iv = new Object() {		void method(){}	 };
	
	static Object CV = new Object() {		void method(){}	 };
	
	void myMethod() {
		Object lv = new Object() {		void method(){}	 };
	}
	
}
