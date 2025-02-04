package study_ch07;

public class Ex7_11 {
	public static void main(String[] args) {
		Child3 c = new Child3();
		c.method1();
		c.method2();
		MyInterface.staticMathod();
		MyInterface2.staticMethod();
	}
}
// 자손클래스
class Child3 extends Parent3 implements MyInterface, MyInterface2 {
	public void method1() {
		System.out.println("method1() in child3");
	}
}
// 조상클래스
class Parent3 {
	public void method2 () {
		System.out.println("method2() in Parent3");
	}
}
//인터페이스
interface MyInterface {
	default void method1() {
		System.out.println("method1() in MyInterface");
	}
	
	default void method2() {
		System.out.println("method2() in MyInterface");
	}
	
	static void staticMathod() {
		System.out.println("staticMethod() in MyInterface");
	}
}
// 인터페이스2
interface MyInterface2 {
	default void method1() {
		System.out.println("method1() in MyInterface2");
	}
	
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface2");
	}
}