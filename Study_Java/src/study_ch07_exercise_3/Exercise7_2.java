package study_ch07_exercise_3;


public class Exercise7_2 {

	public static void main(String[] args) {
		
		SutdaDeck deck = new SutdaDeck();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
	
		for(int i=0; i<deck.cards.length; i++) {
			System.out.print(deck.cards[i] +",");
		}
		System.out.println();
		
		deck.shuffle();
		
		for(int i=0; i<deck.cards.length; i++) {
			System.out.print(deck.cards[i] +",");
		}
		
		System.out.println();
		System.out.println(deck.pick(0));
	
	}
	
}
