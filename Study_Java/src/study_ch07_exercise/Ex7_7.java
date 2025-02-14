package study_ch07_exercise;

class Car {
	
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brr~~");
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

public class Ex7_7 {

	static void doWork(Car c) {
		if(c instanceof FireEngine) {
			System.out.println("doWork() 정상실행");
			FireEngine fe = (FireEngine) c;
			fe.water();
		} else {
			System.out.println("doWork() 실행불가 :인스턴스 타입이 일치하지 않음.");
		}
	}
	
	public static void main(String[] args) {
		
		Car car = new Car();
		Car car2 = null; 
		Car car3 = new Car();
		
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		FireEngine fe3 = null;
		
		car.drive();
//		car.water();	// 에러 : car이 가리키는 인스턴스(Car)는 water()가 없음.
		fe.water();		

		
		// 1) 조상타입 참조변수(Car)가 자손타입 인스턴스(FireEngine)를 가리킬때
		System.out.println("1) 조상타입 참조변수(Car)가 자손타입 인스턴스(FireEngine)를 가리킬때");
		car2 = fe;
		fe2 = (FireEngine) car2; 
		fe2.water();			 // 사용가능
		
		System.out.println();
		doWork(car2);

		System.out.println();
		doWork(car3);
		
		System.out.println();
		// 2) 조상타입 참조변수(Car)가 조상타입 인스턴스(Car)를 가리킬때
		System.out.println("2) 조상타입 참조변수(Car)가 조상타입 인스턴스(Car)를 가리킬때");
/*에러*/ fe3 = (FireEngine) car3; //ClassCastException에러 : 참조변수가 가리키는 인스턴스(Car)의 자손타입의 참조변수(FireEngine)으로 형변환은 허용되지 않음.
		fe3.water();			// 사용불가
		
		
		
	}

}
