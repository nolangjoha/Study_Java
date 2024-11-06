package Study_ch02;

public class Exercise2_8 {

	public static void main(String args[]) {
		
		int x = 1;
		int y = 2;
		int z = 3;
		
		int tmp;
		
		// tmp, x, y, z 
		
		tmp = x;   // tmp=1
		x = y;     // x=2
		y = z;     // y=3
		z = tmp;   // z=1
		
		
		System.out.println("x= " + x);  // x=2
		System.out.println("y= " + y);  // y=3
		System.out.println("z= " + z);  // z=1
		
	}
	
}
