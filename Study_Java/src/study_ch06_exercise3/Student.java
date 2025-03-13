package study_ch06_exercise3;

public class Student {

	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student(){}
	
	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	String info() {
		
		int sum = kor + eng + math;
		float average = (int)(sum / 3f *10 + 0.5) /10f;
		
		return name + ", " +
				ban + ", " +
				no + ", " +
				kor + ", " +
				eng + ", " +
				math + ", " +
				sum + ", " +
				average;
	}
	
	
	public int getTotal() {
		return kor + eng + math;
	}
	
	public float getAverage() {
		return (int)(getTotal()/3f * 10 + 0.5f)/10f;
	}
	
	
	
	
}
