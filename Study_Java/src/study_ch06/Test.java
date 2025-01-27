package study_ch06;

class Student1 {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	Student1(){}

	Student1(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	String info() {
		return name + ", "
			+  ban + ", "
			+  no + ", "
			+  kor + ", "
			+  eng + ", "
			+  math + ", "
			+ (kor+eng+math) + ", "
			+ (int)((kor+eng+math)/3f * 10 +0.5)/10f
				;
	}
	
	int getTotal() {
		return kor + eng + math;
	}
	
	float getAverage() {
		return (int)(getTotal()/3f *10 + 0.5f)/10f;
	}
	
}

public class Test {
	public static void main(String[] args) {
	
		//2번 문제
//		Student1 s = new Student1("홍길동", 1 ,1 ,100 ,60 ,76);
//		
//		String str = s.info();
//		System.out.println(str);

		//3번문제
//		Student1 s = new Student1();
//		s.name = "홍길동";
//		s.ban = 1;
//		s.no = 1;
//		s.kor = 100;
//		s.eng = 60;
//		s.math = 76;
//				
//		System.out.println("이름: " + s.name);
//		System.out.println("총점: " + s.getTotal() );
//		System.out.println("평균: " + s.getAverage());

		// 4번문제
//		System.out.println(getDistance(1, 1, 2, 2));
		
		//6번분제
//		MyPoint1 p = new MyPoint1(1,1);
//		System.out.println(p.getDistance(2, 2));

		//17번 문제
//		int[] original = {1,2,3,4,5,6,7,8,9};
//		System.out.println(java.util.Arrays.toString(original));
//		
//		int[] result = shuffle(original);
//		System.out.println(java.util.Arrays.toString(result));
		
		//18번문제
		String str = "";
//		System.out.println(str.charAt(2));
		System.out.println(str + "는 숫자입니까?" + isNumber(str));
		
		str = "123499";
		System.out.println(str + "는 숫자입니까?" + isNumber(str));
	}
	//4번문제
//	static double getDistance(int x, int y, int x1, int y1) {
//		return 	Math.sqrt((x1-x)*(x1-x)+(y1-y)*(y1-y));
//	}
	
	//17번문제
	static int[] shuffle(int[] arr) {
		if(arr==null || arr.length==0) return arr;
		
		for(int i=0; i<arr.length; i++) {
			int idx = (int)(Math.random()*arr.length);
			int tmp = 0;

			tmp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = tmp;
		}
		return arr;
	}

	//18번 문제
	static boolean isNumber (String str) {
		if (str==null || str.equals("")) return false;
		
		for(int i=0; i<str.length(); i++) {
			if(!('0' <= str.charAt(i) && str.charAt(i) <='9')) {
				return false;
			}
		}
		return true;
	}
	
	
}

class MyPoint1 {
	int x;
	int y;
	
	MyPoint1(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	double getDistance(int x, int y) {
		return Math.sqrt((this.x -x)*(this.x -x)+(this.y-y)*(this.y-y));
	}
	
}
