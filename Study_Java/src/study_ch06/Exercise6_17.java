package study_ch06;

public class Exercise6_17 {

	static int[] shuffle(int[] arr) {
		
		if(arr == null || arr.length == 0) {
			return arr;
		}
		
		for(int i=0; i<arr.length; i++) {
			int idx = (int)(Math.random()*arr.length);
			
			int tmp = arr[idx];
			arr[idx] = arr[i];
			arr[i] = tmp;			
		}
		
		return arr;
	}
	
	
	public static void main(String[] args) {
		
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}
	
}
