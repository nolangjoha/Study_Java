package study_ch07_exercise;

class Product{
	int price;
	int bonusPoint;
	
	Product() {}
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price/10.0);
	}
}

class Tv1 extends Product {
	
	Tv1() {
		super(100);
	}

	public String toString() { return "Tv";	}
}

class Computer extends Product {
	
	Computer() {
		super(200);
	}
	
	public String toString() {	return "Computer";	}
}

class Audio extends Product {
	
	Audio() {
		super(50);
	}
	
	public String toString() {	return "Audio";	}
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	Product[] cart = new Product[10];
	int i =0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[i++] = p;
		System.out.println(p+"을/를 구입하셨습니다.");
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		for(int i=0; i<cart.length; i++) {
			if(cart[i]==null) break;
			sum += cart[i].price;
			itemList += cart[i] + ",";
		}
		System.out.println("구입하신 물품의 총금액은 " + sum + "만원 입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}
}

public class Ex7_8 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv1());
		b.buy(new Computer());
		b.buy(new Audio());
		b.summary();
		
//		System.out.println("현재 남은 돈은 " + b.money + "만원 입니다.");
//		System.out.println("현재 보너스점수는 " + b.bonusPoint + "점 입니다.");
	}
	
}
