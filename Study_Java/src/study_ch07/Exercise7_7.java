package study_ch07;

class Outer5 {
	static class Inner {
		int iv = 200;
	}
}

public class Exercise7_7 {
	public static void main(String[] args) {
		
		Outer5.Inner ii = new Outer5.Inner();
		System.out.println(ii.iv);
		
	}
}
