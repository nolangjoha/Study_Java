package Study_ch02;

public class Ex2_11_overflow {

	public static void main(String[] args) {
		
		short sMin = -32678,
			  sMax = 32767;
		
		char cMin = 0, 
			 cMax = 65535;
		
		System.out.println("sMin = " + sMin);
		System.out.println("sMin - 1 = " + (short)(sMin-1));
		System.out.println("sMax = " + sMax);
		System.out.println("sMax + 1 = " + (short)(sMax+1));
		
		System.out.println("----------");
		
		System.out.println("cMin = "+ (int)cMin);
		System.out.println("cMin - 1 = " + (int)--cMin);
		System.out.println("cMax = " + (int)cMin);
		System.out.println("cMax + 1 = " + (int)++cMax);
		
	}
	
	
}
