package study_ch07_exercise_2;

class Outer {
	
	int value = 10;
	
	class Inner {
		int iv = 100;
		int value = 20;
		
		void method1() {
			int value = 30;

			
			System.out.println(value);
			System.out.println(this.value);
			System.out.println(Outer.this.value);
		}
		
	}
	
	static class StaticInner {
		int iv = 200;
	}
}

public class Exercise7_6 {
	public static void main(String[] args) {
		
		//7-6
		Outer o = new Outer();
		Outer.Inner oi = o.new Inner();
		System.out.println(oi.iv);
		
		//7-7
		Outer.StaticInner osc = new Outer.StaticInner();
		System.out.println(osc.iv);
		
		//7-8
		Outer oo = new Outer();
		Outer.Inner inner = oo.new Inner();
		
		inner.method1();
		
		
	}
}
