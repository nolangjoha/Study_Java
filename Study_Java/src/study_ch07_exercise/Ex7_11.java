package study_ch07_exercise;

//인터페이스1
interface MyInterface {
	default void method1() {
		System.out.println("method1() in MyInterface");
	}

	default void method2() {
		System.out.println("method2() in MyInterface");
	}
	
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface");
	}
}

//인터페이스2
interface MyInterface2 {
	default void method1() {
		System.out.println("method1() in MyInterface2");
	}
	
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface2");
	}
}

// 조상클래스
class Parent3 {
	public void method2() {
		System.out.println("method2() in Parent3");
	}
}

// 자손클래스 : 조상클래스 상속, 인터페이스1,2 구현
class Child3 extends Parent3 implements MyInterface, MyInterface2 {
	public void method1() {
		System.out.println("method1() in Child3");
	}
}

public class Ex7_11 {

	public static void main(String[] args) {
		Child3 c= new Child3();
		c.method1();
		c.method2();    //default 메서드는 무시된다.
		MyInterface.staticMethod();
		MyInterface2.staticMethod();
	}
	
}
