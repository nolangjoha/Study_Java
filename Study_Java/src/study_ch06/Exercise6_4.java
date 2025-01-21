package study_ch06;

public class Exercise6_4 {

	static double getDistance(int x, int y, int x1, int y1) {
		
		int xLenth = x-x1;
		int yLenth = y-y1;
		
		double diagonal = Math.sqrt((xLenth*xLenth) + (yLenth*yLenth));
		
		return diagonal;
		
	}
	
	public static void main(String[] args) {
		System.out.println(getDistance(1, 1, 2, 2));
	}
	
}
