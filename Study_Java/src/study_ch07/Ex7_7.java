package study_ch07;

public class Ex7_7 {
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;	// car = (Car)fe; (암묵적형변환)
//		car.water; //car은 Car타입으로 FireEngine에 있는 water메서드를 호출할 수 없다.
		fe2 = (FireEngine) car; // car이 FireEngine인스턴스를 참조하고 있다는 보장이 필요함. 명시적 형변환
		fe2.water();
	}
}

class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrrr~");
	}

	void stop() {
		System.out.println("stop!!!");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("water!!!");
	}
}