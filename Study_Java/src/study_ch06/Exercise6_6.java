package study_ch06;

class MyPoint {
	int x;
	int y;
	
	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	double getDistance(int x, int y) {
		
		int xLenth = this.x - x;
		int yLenth = this.y - y;
		
		double diagonal = Math.sqrt((xLenth*xLenth) + (yLenth*yLenth));
		
		return diagonal;
	}
	
}


public class Exercise6_6 {

	public static void main(String[] args) {

		MyPoint p = new MyPoint(1,1);
		System.out.println(p.getDistance(2, 2));
		
	}
	
	
}
