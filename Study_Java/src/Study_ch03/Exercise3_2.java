package Study_ch03;

public class Exercise3_2 {

	public static void main(String args[]) {
		
		int x = 2;
		int y = 5;
		char c = 'A';  // 'A'의 문자코드는 65
		
		System.out.println(y >= 5 || x < 0 && x >2);  // &&가 우선순위가 더 높음 x < 0 && x >2는 false && fasel임. 이후 ||로 y >= 5는 true이므로 // true
		System.out.println(y += 10 - x++);			  // y = y + (10 - x++)  // y = 5 + (10 - 2) // y = 13 (x는 추후 3)  
		System.out.println(x += 2);					  // x = x + 2 // x = 3 + 2  // x = 5
		System.out.println(!('A' <= c && c <= 'Z'));  // !(ture) // fasle
		System.out.println('C' - c); 				  // 'C'= 67 , c = 65, 이항연산자는 자동 형변환을 한다. 67-65 = 2
		System.out.println('5' - '0');				  // '5' = 53, '0' = 48 // 53-48 = 5 
		System.out.println(c + 1);					  // 65 + 1 = 66
		System.out.println(++c);					  // 단항연산자는 자동형변환을 하지 않는다. c는 문자로 출력된다. // 전위형으로 c는 66 // c = 'B'
		System.out.println(c++);                      // c = 'B' // 추후에는 1이 더해져 c = 'C'
		System.out.println(c);						  // c = 'c'
		
	}
	
	
}
