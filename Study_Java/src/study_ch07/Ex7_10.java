package study_ch07;

public class Ex7_10 {
	public static void main(String[] args) {
		Unit[] group = {new Marine(), new Tank(), new Dropship()};
		
		for(int i=0; i<group.length; i++) {
			group[i].move(100, 200);
		}
		
	}
}

// 추상클래스
abstract class Unit {
	int x,y;
	abstract void move(int x, int y);
	void stop() {}
}

// 보병
class Marine extends Unit {
	void move(int x, int y) {
		System.out.println("Marine[x=" + x + ", y=" + y + "]");
	}
	
	void stimPack() {}
}

// 탱크
class Tank extends Unit {
	void move(int x, int y) {
		System.out.println("Tank[x=" + x + ", y=" + y + "]");
	}
	void changeMode() {}
}

// 수송선
class Dropship extends Unit {
	void move(int x, int y) {
		System.out.println("Dropship[x=" + x + ", y=" + y + "]");
	}
	void load() {}
	void unload() {}
}