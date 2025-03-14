package study_ch09_exercise;

public class Exercise9_5 {

	public static String delChar(String src, String delCh) {
		
		StringBuffer sb = new StringBuffer(src.length());
		
		for(int i=0; i<src.length(); i++) {
			char ch = src.charAt(i);
			
			if(delCh.indexOf(ch) == -1) {
				sb.append(ch);
			}
		}
		return sb.toString();
		
	}

	
	public static void main(String[] args) {
		
		String a = "(1!2@3#4~5)";
		String del = "~!@#$%^&*()";
		
		System.out.println(delChar(a,del));
	
		
		String b = "(1 2 3 4\t5)";
		String delb = " \t";
		
		System.out.println(delChar(b,delb));
	
	}
	
}
