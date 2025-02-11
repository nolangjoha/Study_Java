package study_ch06_exercise;

class MyPoint {
	int x;
	int y;
	
	MyPoint(int x, int y) {
		this.x=x;
		this.y=y;
	}

	public double getDistance(int i, int j) {
		return Math.sqrt((x-i)*(x-i) + (y-j)*(y-j));
	}
}


public class Exercise6_6 {

	public static void main(String[] args) {
		MyPoint p = new MyPoint(1,1);
		
		System.out.println(p.getDistance(2,2));
		
	}
	
}
