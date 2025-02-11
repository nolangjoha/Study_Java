package study_ch06_exercise;

public class Exercise6_18 {

	public static boolean isNumber(String str) {
		
		if(str==null || str.equals(""))
			return false;
		
		for(int i=0; i<str.length(); i++) {
			char a = str.charAt(i);
			if(!('0'<= a && a <='9')) {
				return false;
			}
		}
		return true;
	}
	
	
	
	public static void main(String[] args) {
		
		String str ="123";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
	
		str = "1234o";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		
		str = "";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		
		System.out.println(str + "는 숫자입니까? " + isNumber(null));
		
	}
	
}
