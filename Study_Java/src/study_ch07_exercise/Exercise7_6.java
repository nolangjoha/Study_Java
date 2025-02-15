package study_ch07_exercise;

class Outer4 {
	int value = 10;
	
	class Inner {
		int iv = 100;
		int value = 20;
		
		void method1() {
			int value = 30;
			System.out.println(value);
			System.out.println(this.value);
			System.out.println(Outer4.this.value);
		}
	}
	
	static class StaticInner{
		int siv = 200;
	}
}

public class Exercise7_6 {
	public static void main(String[] args) {
		
		Outer4 o = new Outer4();
		Outer4.Inner oi = o.new Inner();
//		System.out.println(oi.iv);

		Outer4.StaticInner os = new Outer4.StaticInner();
//		System.out.println(os.siv);
		
		
		Outer4.Inner inner = o.new Inner();
		inner.method1();
	}
}
