package study_ch07;

//상품
class Product {
	int price;
	int bonusPoint;
	
	Product(int price) {
		this.price = price;
		bonusPoint= (int) (price/10.0);
	}
}
// TV
class Tv1 extends Product {
	Tv1(){
		super(100);
	}
	
	public String toString() {	return "Tv"; }
}
// 컴퓨터
class Computer extends Product {
	Computer () {
		super(200);
	}
	
	public String toString() {return "Computer";}
}
//구매자
class Buyer {
	int money = 1000;
	int bonusPoint = 0 ;
	Product[] cart = new Product[10];
	int i = 0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[i++] = p;
		System.out.println(p +"을/를 구매하셨습니다.");
	}
}

public class Ex7_8 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv1());
		b.buy(new Computer());
		
		System.out.println("현재 남은 돈은" + b.money +"만원 입니다.");
		System.out.println("현재 보너스점수는 " + b.bonusPoint + "점 입니다.");
	}
}

