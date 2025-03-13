package study_ch06_exercise3;

public class MyPoint {

	int x;
	int y;
	
	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public double getDistance(int i, int j) {
		return 	Math.sqrt((x-i)*(x-i) + (y-j)*(y-j));

	}
}
