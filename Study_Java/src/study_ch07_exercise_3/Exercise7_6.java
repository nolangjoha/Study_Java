package study_ch07_exercise_3;


class Outer{
	

//	class Inner {
//		int iv = 10;
//	}
	
//	static class Inner {
//		int iv = 200;
//	}

	int value = 10;
	
	class Inner{
		int value = 20;
		void method1() {
			int value = 30;

			System.out.println(value);
			System.out.println(this.value);
			System.out.println(Outer.this.value);

		}
	}
	
	
	
}


public class Exercise7_6 {
	public static void main(String[] args) {
//		Outer oc = new Outer();
//		Outer.Inner ic = oc.new Inner();
//		System.out.println(ic.iv);

//		Outer.Inner sic = new Outer.Inner();
//		System.out.println(sic.iv);
		
		
		Outer oc = new Outer();
		Outer.Inner inner = oc.new Inner();
		
		inner.method1();
		
		
	}
	
	
}
