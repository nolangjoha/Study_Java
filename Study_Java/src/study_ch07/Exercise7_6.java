package study_ch07;

class Outer4 {
	
	//인스턴스 멤버 위치
	class Inner {
		int iv = 100;
	}
}

public class Exercise7_6 {
	public static void main(String[] args) {

		Outer4 outer = new Outer4();
		Outer4.Inner inner = outer.new Inner();
				
		System.out.println(inner.iv);
	}
}
