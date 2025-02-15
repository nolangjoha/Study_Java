package study_ch07_exercise;

class SutdaDeck {
	
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	
	SutdaDeck() {
		for(int i=0; i < cards.length; i++) {
			
			int num = i % 10 + 1;
			boolean isKwang = (i<10) && (num ==1 || num == 3 || num == 8);
					
			cards[i] = new SutdaCard(num, isKwang);
		}
	}
	
	public void shuffle() {
		
		for(int i=0; i < cards.length; i++) {
			int randomNum = (int) (Math.random() * CARD_NUM);
			SutdaCard tmp = cards[i];
			cards[i] = cards[randomNum];
			cards[randomNum] = tmp;
		}
	}
	
	public SutdaCard pick(int index) {
		if(index >= CARD_NUM || index < 0) return null;
		
		return cards[index];
	}
	
	public SutdaCard pick() {
		int randomNum = (int) (Math.random() * CARD_NUM);
//		return cards[randomNum];
		return pick(randomNum);
	}

}

class SutdaCard {
	
	int num;
	boolean isKwang;
	
	SutdaCard() {
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang) {
		this.num  = num;
		this.isKwang = isKwang;
	}
	
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

public class Exercise7_1 {
	public static void main(String[] args) {
		
		SutdaDeck deck = new SutdaDeck();
		
		for(int i=0; i < deck.cards.length; i++) {
			System.out.print(deck.cards[i] +",");
		}
	
		System.out.println();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for(int i=0; i<deck.cards.length; i++) {
			System.out.print(deck.cards[i] + ",");
		}
		
		System.out.println();System.out.println(deck.pick(0));
		
	}
}
