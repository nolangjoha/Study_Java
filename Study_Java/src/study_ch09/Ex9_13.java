package study_ch09;

import static java.lang.Math.*;

public class Ex9_13 {

	public static void main(String[] args) {
		
		double val = 90.7552;
		System.out.println("round(" +val + ")=" + round(val));
		
		val *= 100;
		System.out.println("round(" +val + ")=" + round(val));
		System.out.println();
		System.out.println("round(" +val + ")/100 =" + round(val)/100);
		System.out.println("round(" +val + ")/100.0 =" + round(val)/100.0);
		
		System.out.println();
		System.out.printf("ceil(%3.1f)=%3.1f%n", 1.1, ceil(1.1));
		System.out.printf("floor(%3.1f)=%3.1f%n", 1.1, floor(1.1));
		System.out.println();
		System.out.printf("round(%3.1f)=%d%n", 1.1, round(1.1));
		System.out.printf("round(%3.1f)=%d%n", 1.5, round(1.5));
		System.out.printf("rint(%3.1f)=%f%n", 1.5, rint(1.5));
		System.out.println();
		System.out.printf("round(%3.1f)=%d%n", -1.5, round(-1.5));
		System.out.printf("rint(%3.1f)=%f%n", -1.5, rint(-1.5));
		System.out.printf("ceil(%3.1f)=%f%n", -1.5, ceil(-1.5));
		System.out.printf("floor(%3.1f)=%f%n", 1.5, floor(-1.5));
		
	}
	
}
