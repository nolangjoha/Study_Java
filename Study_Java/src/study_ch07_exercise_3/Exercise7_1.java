package study_ch07_exercise_3;

class SutdaCard {
	int num; 
	boolean isKwang;
	
	SutdaCard() {
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
	
}

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		for(int i=0; i<cards.length; i++) {
			int num = i %10+1;
			boolean isKwang = false;
			
			if(i<10 && (num == 1 || num==3 || num== 8)) {
				isKwang = true;
			}
			
			cards[i] = new SutdaCard(num, isKwang);
		}
	}

	void shuffle() {
		for(int i=0; i<cards.length; i++) {
			
			int idx = (int)(Math.random() * cards.length);

			SutdaCard tmp = cards[i];
			cards[i] = cards[idx];
			cards[idx] = tmp;
		}
	}
	
	SutdaCard pick(int index) {
		
		if(index < 0 || cards.length <= index) {
			return null;
		}
			
		return cards[index]; 
	}
	
	SutdaCard pick() {
		
		int index = (int)(Math.random() * cards.length);	
		
		return pick(index); 
	}

	
	
	


}

public class Exercise7_1 {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		
		for(int i = 0; i<deck.cards.length; i++) {
			System.out.print(deck.cards[i]+ ", ");
		}
		
	}
	
}
