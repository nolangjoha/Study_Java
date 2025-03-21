package study_ch11;

import java.util.*;

public class Ex11_10 {
	public static void main(String[] args) {
		Set set = new HashSet();
		
		for(int i=0; set.size()<6; i++) {
			int num = (int) (Math.random()*45) + 1;
			set.add(new Integer(num));
		}

		System.out.println("set :"+set);
		
		List list = new LinkedList(set);
		Collections.sort(list);
		System.out.println("list:"+list);
		
	}
}
