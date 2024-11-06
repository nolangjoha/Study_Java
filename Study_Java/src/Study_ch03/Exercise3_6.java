package Study_ch03;

public class Exercise3_6 {

	public static void main(String[] args) {
		int fahrenheit = 100;  // 화씨
		float celcius = (int)((5/9f * (fahrenheit-32))* 100 + 0.5) / 100f; // 섭씨
						// 원래 공식 : 5/9f * (fahrenheit-32) / 5/9는 int 형태로 0이 나오기 때문에 둘중 하나를 float나 double로 해줘야 했다.
		 				// 37.77778
						// 소수점 3번째 자리에서 반올림 해줘야 하니까 일단 소수점을 뒤로 2칸 옮기겠다.
						//  37.7778 * 100 = 3777.778  // 이후 0.5를 더한다. 세번째 자리가 5 이상이면 1의 자리가 더해질것이고, 그게 아니면 1의 자리는 변동 없을 것
						//  37.7778 + 0.5 = 3778.278  // int 형으로 명시적 형변환 하며 소수점을 버린다.
						// (int) 3778.278 -> int 3778 // 이후 100f로 나눠주면 float형으로 형변환 될것.
						// 3778 / 100f = 37.78 
		
		System.out.println("Fahrenheit: " + fahrenheit);
		System.out.println("Celcius: " + celcius);
		
		
	}
	
	
	
}
