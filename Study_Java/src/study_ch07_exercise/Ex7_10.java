package study_ch07_exercise;

abstract class Unit {
	int x, y;
	abstract void move(int x, int y);
	void stop() {}
}

class Marine extends Unit {
	void move(int x, int y) {
		System.out.println("Marine[x=" + x + ", y=" + y + "]");
	}
	void stimPack() {}
}

class Tank extends Unit {
	void move(int x, int y) {
		System.out.println("Tank[x=" + x + ", y=" + y + "]");
	}
	void changeMode() {}
}

class DropShip extends Unit {

	void move(int x, int y) {
		System.out.println("DropShip[x=" + x + ", y=" + y + "]");
	}
	void load() {}
	void unloaod() {}
}

public class Ex7_10 {

	public static void main(String[] args) {
		Unit[] group = {
				new Marine(),
				new Tank(),
				new DropShip()
		};
		
		for(int i=0; i<group.length; i++) {
			group[i].move(100, 200);
		}
	}
	
}
