package study_ch06;

// 1번문제
class Student1 {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	// 2번문제 :기본생성자
	Student1(){}
	
	// 2번문제
	Student1(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	// 2번문제 : info()
	String info() {
		return name + ", " +
				ban + ", " +
				no + ", " +
				kor + ", " +
				eng + ", " +
				math+ ", " +
				(kor+eng+math) + ", " +
				((int)(((kor+eng+math) *10 /3f) + 0.5f)/10f);
	}
	
	// 3번문제 : getTotal()
	int getTotal() {
		return kor+eng+math;
	}
	// 3번문제 : getAverage()
	float getAverage() {
		return (int)(((kor+eng+math) /3f * 10) +0.5f)/10f;
	}
}

// 6번 문제
class MyPoint1 {
	int x;
	int y;
	
	MyPoint1() {}
	
	MyPoint1(int x, int y) {
		this.x = x;
		this.y = y;
	}
	// 6번 문제 getDistance()
	double getDistance(int x1, int y1) {
//		
//		int xLenth = this.x -x;
//		int yLenth = this.y -y;
//		double z = Math.sqrt(xLenth*xLenth + (yLenth*yLenth);	
		
//		double z = Math.sqrt((this.x -x)*(this.x -x) + (this.y -y)*(this.y -y));
		
		return Math.sqrt((x -x1)*(x -x1) + (y -y1)*(y -y1));
	}
	
}

// 19번 문제
class MyTv1 {
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL= 1;
	
	
	void  turnOnOff() {
		isPowerOn = !isPowerOn;
	}
	
	void volumeUp() {
		if(volume < MAX_VOLUME)
			volume++;
	}
	
	void volumeDown() {
		if(volume>MAX_VOLUME)
			volume--;
	}
	
	void channelUp() {
		if(channel == MAX_CHANNEL)
			channel = MIN_CHANNEL;
		channel++;
	}

	void channelDown() {
		if(channel == MIN_CHANNEL)
			channel = MAX_CHANNEL;
		channel--;
		
	}

}


public class Test {
	
	// 4번 문제 :getDistance(int a,int b,int c,int d)
	static double getDistance(int x, int y, int x1, int y1) {
		
		int xLenth = x-x1;
		int yLenth = y-y1;
		
		double z = Math.sqrt(xLenth*xLenth + yLenth*yLenth);
		
		return z;
	}
	
	// 17번 문제: shuffle(int[] arr)
	static int[] shuffle(int[] arr) {
		
		// 유효성 체크
		if(arr == null || arr.length==0)
			return arr;
		
		int idx = (int) (Math.random()*arr.length);
		
		for(int i=0; i<arr.length; i++) {
			int tmp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = tmp;
		}		
		
		return arr;
	}
	
	// 18번 문제 : isNumber(String str)
	static boolean isNumber(String str) {
		
		if(str==null || str.equals("")) 
			return false;
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);	
			
			if(!('0'<= ch && ch <'9'))
				return false;
		}
		
		return true;
	}
	
	// 20번 문제
	static int max(int[] arr) {
		if(arr == null || arr.length == 0)
			return -999999;
		
		int max = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max)
				max = arr[i];
		}
		return max;
	}
	
	// 21번 문제
	static int abs(int value) {
		
		return value > 0 ? value : (value < 0 ? -value : 0);
	}
	
	
	// 메인메서드
	public static void main(String[] args) {
		
		int value = 5;
		System.out.println(value + "의 절대값: " + abs(value));

		value = -10;
		System.out.println(value + "의 절대값: " + abs(value));
		
		value = 0;
		System.out.println(value + "의 절대값: " + abs(value));

		
		
	}
}
