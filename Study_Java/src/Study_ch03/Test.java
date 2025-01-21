package Study_ch03;

public class Test {

	public static void main(String[] args) {
		
		int fahrenheit = 100;
		float celcius = (int)((5/9f * (fahrenheit-32)) * 100 + 0.5f)/ 100f;
		
		System.out.println("f: " + fahrenheit);
		System.out.println("c: " + celcius);

		
	}
	
}
