package study_ch07;

class Product3 {
	int price;
	int bounusPoint;
	
//	Product3() {}
	
	Product3(int price) {
		this.price = price;
		bounusPoint = (int) (price /10.0);
	}
}

class Tv3 extends Product3 {

	Tv3(int price) {
		super(price);
	}
	
}

public class Exercise7_3 {
	public static void main(String[] args) {
		Tv3 t = new Tv3(3000);
		
		System.out.println(t.price);
	}
}
