package study_ch09;

public class Exercise9_3 {

	public static int count(String src, String target) {
		int count = 0;
		int pos =0;
		
//		for(pos =0; (pos = src.indexOf(target, pos)) != -1; pos+=target.length()){
//			count++;
//		}
//		
//		return count;

	
		while(true) {
			pos = src.indexOf(target, pos);
			
			if(pos != -1) {
				count++;
				pos+=target.length();
			} else {
				break;
			}
		}
	
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(count("12345AB12AB345AB", "AB"));
		System.out.println(count("12345", "AB"));
		
	}
	
}

