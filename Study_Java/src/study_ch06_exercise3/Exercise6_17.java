package study_ch06_exercise3;

public class Exercise6_17 {

	
	public static int[] shuffle(int[] arr) {
		
		if(arr.length == 0 || arr == null) {
			return arr;
		}
		
		for(int i=0; i<arr.length; i++) {
			int idx = (int) (Math.random()*arr.length);
			
			int tmp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = tmp;
		}
		
		return arr;
	}
	
	
	
	public static void main(String[] args) {
	
		int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
 		System.out.println(java.util.Arrays.toString(original));
		
 		int[] result = shuffle(original);
 		System.out.println(java.util.Arrays.toString(result));
		
 		int[] a = null;
 		System.out.println(java.util.Arrays.toString(a));
 		
 		
	}
	
	
}
