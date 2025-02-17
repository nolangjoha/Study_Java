package study_ch07_exercise_2;

public class Exercise7_2 {

	public static void main(String[] args) {
		
		SutdaDeck deck = new SutdaDeck();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
	
		deck.shuffle();
		
		for(int i=0; i<deck.cards.length; i++) {
			System.out.print(deck.cards[i] +",");
		}
		
		System.out.println();
		System.out.println(deck.pick(0));
	
	}
	
	/*

	자손의 생성자는 조상의 멤버르 쓰기위해 가장먼저 조상의 생성자를 super()로 호출하여 초기화 한다.
	Product는 매개변수 생성자만 있는 상태로, 기본생성자가 자동으로 추가되지 않는다.
	이때 Tv는 기본생성자만 갖고 있는데 컴파일 시에 super()로 조상의 기본생성자를 호출한다. 
	그런데 현재 조상클래스에 기본생성자가 없는상태로, 없는 생성자를 호출하려 하니 에러가 발생한것.
	
	조상클래스에 기본생성자를 추가해 주면 된다.



	 */
}
