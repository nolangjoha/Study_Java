package Study_ch03;

public class Ex3_2_Increment_Decrement_Operator_basic {

	public static void main(String args[]) {
		// [증감연산자]
	
		int i=5, j=0;
		
		
		// <후위형>
		j = i++;		
		// j = i; // j=5
		// i++;	  // i+1=6	 // i=6
		System.out.println("j = i++; 실행 후, i= " + i + ", j= " + j);
		
		i=5;
		j=0;
		
		// <전위형>
		j = ++i;		
		// ++i;     // 6
		// j = i;   // 6 = 6
		System.out.println("j = ++i; 실행 후, i= " + i + ", j= " + j);
		
	}
	
	
}
