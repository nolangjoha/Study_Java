package study_ch07;

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];

	// 생성자
	SutdaDeck() {
		for(int i=0; i<cards.length; i++) {
			int num = i%10 +1;
			boolean isKwang = (i<10) && (num ==1 || num ==3 || num ==8);
			
			cards[i] = new SutdaCard(num, isKwang);
		}
	}

	
	public void shuffle () {
		for(int i=0; i<cards.length; i++) {
			int num = (int) (Math.random() * cards.length);
			SutdaCard tmp = cards[i];  
			cards[i] = cards[num];
			cards[num] = tmp;
		}
	}
	
	public SutdaCard pick(int index) {
		if(index < 0 || index >= CARD_NUM) return null;
		return cards[index];
	}
	
	public SutdaCard pick() {
		int index = (int) (Math.random()*cards.length);
		return pick(index);
	}

}

class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard() {
		this(1,true);
	}
	
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

public class Exercise7_1 {
	public static void main(String[] args) {
		
		SutdaDeck deck = new SutdaDeck();

		for(int i =0; i < deck.cards.length; i++) {
			System.out.print(deck.cards[i] + ", ");
		}
	}
	

}