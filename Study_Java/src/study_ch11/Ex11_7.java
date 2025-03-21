package study_ch11;

import java.util.Arrays;
import java.util.Comparator;

public class Ex11_7 {

	public static void main(String[] args) {
		String[] strArr = {"cat", "Dog", "lion", "tiger"};
		
		Arrays.sort(strArr);
		System.out.println("strArr=" + Arrays.toString(strArr));
		
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); 
		System.out.println("strArr=" + Arrays.toString(strArr));
		
		Arrays.sort(strArr, new Desending());
		System.out.println("strArr=" + Arrays.toString(strArr));
		
	}
}

class Desending implements Comparator{
	
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			
			int result = c1.compareTo(c2) * -1;
			System.out.println("compare(" + c1 + ", " + c2 + ") = " + result);
			return result;
		}
		return 1;
	}
	
}