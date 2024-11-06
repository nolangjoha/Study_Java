package Study_ch03;

public class Ex3_16_Logical_Operator_negation {

	//[논리부정연산자] !
	public static void main(String[] args) {

		boolean b = true;
		char ch = 'C';
		
		System.out.printf("b=%b%n", b);			// true
		System.out.printf("!b=%b%n", !b); 		// false
		System.out.printf("!!b=%b%n", !!b);		// true
		System.out.printf("!!!b=%b%n", !!!b);	// false
		System.out.println();
		System.out.printf("ch = %c%n", ch);
		System.out.printf("ch < 'a' || ch > 'z' = %b%n", ch <'a' || ch >'z');
		System.out.printf("!('a' <= && ch <= 'z') = %b%n", !('a' <= ch && ch <= 'z'));
		System.out.printf(" 'a' <= && ch <= 'z' = %b%n", 'a' <= ch && ch <= 'z');
		
		
		
		
	}

}
